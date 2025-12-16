package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.gm;
import defpackage.gy7;
import defpackage.km;
import defpackage.nm;
import defpackage.nmf;
import defpackage.nua;
import defpackage.om;
import defpackage.ox7;
import defpackage.tha;
import defpackage.ti1;
import defpackage.tk4;
import defpackage.ue3;
import defpackage.ul;
import defpackage.ul0;
import defpackage.wm;
import defpackage.yl;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds;", "", "()V", "Companion", "Request", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetExternalIdsByOkIds {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String METHOD_NAME = "vchat.getExternalIdsByOkIds";

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds$Companion;", "", "<init>", "()V", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lnmf;", "mapToStringApiParam", "(Ljava/util/List;)Lnmf;", "", "METHOD_NAME", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final nmf mapToStringApiParam(List<ti1> list) {
            return new nmf(ApiProtocol.PARAM_UIDS, ue3.N(list, ",", null, null, GetExternalIdsByOkIds$Companion$mapToStringApiParam$1.INSTANCE, 30));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010*\u001a\u00020'8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds$Request;", "Lkm;", "Lnua;", "Lyl;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "candidates", "<init>", "(Ljava/util/List;)V", "", "canRepeat", "()Z", "shouldGzip", "shouldPost", "shouldReport", "willWriteParams", "willWriteSupplyParams", "Lgy7;", "writer", "Lqqg;", "writeParams", "(Lgy7;)V", "writeSupplyParams", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lul;", "getConfigExtractor", "()Lul;", "configExtractor", "Lox7;", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "()Lox7;", "failParser", "getOkParser", "okParser", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lnm;", "getScope", "()Lnm;", "scope", "Lom;", "getScopeAfter", "()Lom;", "scopeAfter", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request implements km, nua, yl {
        private final /* synthetic */ ul0 $$delegate_0;

        public Request(List<ti1> list) {
            Uri uriA = wm.a(GetExternalIdsByOkIds.METHOD_NAME);
            gm gmVar = new gm();
            gmVar.a(GetExternalIdsByOkIds.INSTANCE.mapToStringApiParam(list));
            this.$$delegate_0 = new ul0(uriA, nm.c, gmVar, ExternalIdsResponse.INSTANCE);
        }

        public boolean canRepeat() {
            return this.$$delegate_0.c.b;
        }

        @Override // defpackage.yl
        public ul getConfigExtractor() {
            this.$$delegate_0.getClass();
            return ul.f;
        }

        @Override // defpackage.yl
        public ox7 getFailParser() {
            this.$$delegate_0.getClass();
            return tha.c;
        }

        @Override // defpackage.yl
        public ox7 getOkParser() {
            return this.$$delegate_0.d;
        }

        @Override // defpackage.hm
        public int getPriority() {
            this.$$delegate_0.getClass();
            return 16;
        }

        @Override // defpackage.hm
        public nm getScope() {
            return this.$$delegate_0.b;
        }

        @Override // defpackage.yl
        public om getScopeAfter() {
            this.$$delegate_0.getClass();
            return om.a;
        }

        @Override // defpackage.hm
        public Uri getUri() {
            return this.$$delegate_0.a;
        }

        @Override // defpackage.nua
        public Object handleInterruptedIO() {
            return new ExternalIdsResponse(new LinkedHashMap());
        }

        @Override // defpackage.hm
        public boolean shouldGzip() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // defpackage.hm
        public boolean shouldPost() {
            return this.$$delegate_0.c.c;
        }

        public boolean shouldReport() {
            this.$$delegate_0.getClass();
            return true;
        }

        @Override // defpackage.hm
        public boolean willWriteParams() {
            return this.$$delegate_0.c.d;
        }

        @Override // defpackage.hm
        public boolean willWriteSupplyParams() {
            return this.$$delegate_0.c.e;
        }

        @Override // defpackage.hm
        public void writeParams(gy7 writer) {
            this.$$delegate_0.writeParams(writer);
        }

        @Override // defpackage.hm
        public void writeSupplyParams(gy7 writer) {
            this.$$delegate_0.writeSupplyParams(writer);
        }
    }
}
