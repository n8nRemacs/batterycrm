package ru.ok.android.externcalls.sdk.id.mapping;

import android.os.Looper;
import defpackage.id5;
import defpackage.ti1;
import defpackage.w0a;
import defpackage.y6d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000e2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00112\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/ExternalToInternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Ly6d;", "rtcLog", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Ly6d;)V", "", "from", "", "filterEmptyParticipantIds", "(Ljava/util/Collection;)Ljava/util/List;", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Ly6d;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalToInternalIdsMapper implements IdsMapper<ParticipantId, ti1> {
    private static final String LOG_TAG = "ExternalToInternalIdsMapper";
    private final OkApiServiceInternal okApiService;
    private final y6d rtcLog;

    public ExternalToInternalIdsMapper(OkApiServiceInternal okApiServiceInternal, y6d y6dVar) {
        this.okApiService = okApiServiceInternal;
        this.rtcLog = y6dVar;
    }

    private final List<ParticipantId> filterEmptyParticipantIds(Collection<ParticipantId> from) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : from) {
            ParticipantId participantId = (ParticipantId) obj;
            if (participantId.id.length() == 0) {
                this.rtcLog.reportException(LOG_TAG, "Empty participant id", new IllegalArgumentException("Empty participant id"));
            }
            if (participantId.id.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<ParticipantId, ti1> map(Collection<? extends ParticipantId> from) {
        LinkedHashMap linkedHashMap;
        Map<ParticipantId, ti1> map;
        boolean z = w0a.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        }
        List<ParticipantId> listFilterEmptyParticipantIds = filterEmptyParticipantIds(from);
        boolean zIsEmpty = listFilterEmptyParticipantIds.isEmpty();
        id5 id5Var = id5.a;
        if (zIsEmpty) {
            return id5Var;
        }
        try {
            Iterable<BatchInternalIdResponse> iterable = (Iterable) this.okApiService.getOkIdsByExternalIds(listFilterEmptyParticipantIds).e();
            ArrayList arrayList = new ArrayList();
            for (BatchInternalIdResponse batchInternalIdResponse : iterable) {
                if (batchInternalIdResponse == null || (map = batchInternalIdResponse.externalToInternalIdsMap) == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<ParticipantId, ti1> entry : map.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap2.putAll((Map) it.next());
            }
            return linkedHashMap2;
        } catch (Throwable th) {
            this.rtcLog.logException(LOG_TAG, "Can't map external ids to internal", th);
            return id5Var;
        }
    }
}
