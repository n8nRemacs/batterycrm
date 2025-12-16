package ru.cyberity.cbr.core.data.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: Applicant.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/g;", "", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k {

    /* compiled from: Applicant.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f433143a;

        static {
            int[] iArr = new int[ReviewStatusType.values().length];
            iArr[ReviewStatusType.Init.ordinal()] = 1;
            iArr[ReviewStatusType.Queued.ordinal()] = 2;
            iArr[ReviewStatusType.Pending.ordinal()] = 3;
            iArr[ReviewStatusType.Prechecked.ordinal()] = 4;
            iArr[ReviewStatusType.Completed.ordinal()] = 5;
            iArr[ReviewStatusType.Unknown.ordinal()] = 6;
            f433143a = iArr;
        }
    }

    @Y61.l
    public static final CBRSDKState a(@Y61.k g gVar, @Y61.k List<Document> list) {
        Document.b.C12444b c12444b;
        switch (a.f433143a[gVar.K().ordinal()]) {
            case 1:
                if (list.isEmpty()) {
                    return CBRSDKState.Failed.ApplicantMisconfigured.INSTANCE;
                }
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Document) it.next()).getResult() != null) {
                            if (!list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((Document) it2.next()).getResult() != null) {
                                            if (!list.isEmpty()) {
                                                Iterator<T> it3 = list.iterator();
                                                while (it3.hasNext()) {
                                                    Document.b result = ((Document) it3.next()).getResult();
                                                    if (((result == null || (c12444b = result.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String()) == null) ? null : c12444b.getAnswer()) == null) {
                                                        return CBRSDKState.Incomplete.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!list.isEmpty()) {
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    if (((Document) it4.next()).getResult() == null) {
                                        return null;
                                    }
                                }
                            }
                            return CBRSDKState.Pending.INSTANCE;
                        }
                    }
                }
                return CBRSDKState.Initial.INSTANCE;
            case 2:
            case 3:
            case 4:
                if (gVar.getRequiredIdDocs().getVideoIdent()) {
                    List<Document> listA = ru.cyberity.cbr.core.common.s.a(list, gVar);
                    if (!(listA instanceof Collection) || !listA.isEmpty()) {
                        Iterator<T> it5 = listA.iterator();
                        while (it5.hasNext()) {
                            if (!((Document) it5.next()).isSubmitted()) {
                                return CBRSDKState.Incomplete.INSTANCE;
                            }
                        }
                    }
                }
                return CBRSDKState.Pending.INSTANCE;
            case 5:
                if (gVar.M()) {
                    return CBRSDKState.Approved.INSTANCE;
                }
                if (gVar.N()) {
                    return CBRSDKState.FinallyRejected.INSTANCE;
                }
                if (gVar.O()) {
                    return CBRSDKState.TemporarilyDeclined.INSTANCE;
                }
                return null;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
