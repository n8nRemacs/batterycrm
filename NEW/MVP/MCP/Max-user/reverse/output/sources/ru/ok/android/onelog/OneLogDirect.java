package ru.ok.android.onelog;

import defpackage.cj0;
import defpackage.cwa;
import defpackage.gy7;
import defpackage.mc;
import defpackage.ml;
import defpackage.om;
import defpackage.ox7;
import defpackage.qqg;
import defpackage.se5;
import defpackage.sm6;
import defpackage.t8i;
import defpackage.tha;
import defpackage.ul;
import java.io.IOException;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0003J\u001d\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/onelog/OneLogDirect;", "", "<init>", "()V", "Lru/ok/android/onelog/OneLogItem;", "item", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lqqg;", "errorCallback", "send", "(Lru/ok/android/onelog/OneLogItem;Lsm6;)V", "Lml;", "getApiClient", "()Lml;", "(Lru/ok/android/onelog/OneLogItem;)V", "flush", "", "kotlin.jvm.PlatformType", "dump", "(Lru/ok/android/onelog/OneLogItem;)Ljava/lang/String;", "one-video-stats_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneLogDirect {
    public static final OneLogDirect INSTANCE = new OneLogDirect();

    public static final class a extends t8i {
        final /* synthetic */ OneLogItem h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, OneLogItem oneLogItem, String str3) {
            super(str3, str, str2);
            this.h = oneLogItem;
        }

        @Override // defpackage.t8i
        public void a(gy7 gy7Var) throws IOException {
            gy7Var.r();
            ItemDumper.dump(this.h, gy7Var);
            gy7Var.q();
        }

        public /* bridge */ /* synthetic */ boolean canRepeat() {
            return true;
        }

        @Override // defpackage.yl
        public /* bridge */ /* synthetic */ ul getConfigExtractor() {
            return ul.f;
        }

        @Override // defpackage.yl
        public /* bridge */ /* synthetic */ ox7 getFailParser() {
            return tha.c;
        }

        @Override // defpackage.yl
        public /* bridge */ /* synthetic */ om getScopeAfter() {
            return om.a;
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ boolean willWriteParams() {
            return true;
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
            return false;
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
        }
    }

    private OneLogDirect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$2() {
        try {
            OneLogImpl.getInstance().flush();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final ml getApiClient() {
        try {
            return OneLogImpl.getInstance().getApiClient();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qqg send$lambda$0(OneLogItem oneLogItem, Exception exc) {
        oneLogItem.log();
        return qqg.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send$lambda$1(OneLogItem oneLogItem, ml mlVar, sm6 sm6Var) {
        try {
            mlVar.a(new a(OneLogImpl.getInstance().getApplicationParam(), OneLogImpl.getInstance().getPlatformParam(), oneLogItem, oneLogItem.collector()));
        } catch (Exception e) {
            sm6Var.invoke(oneLogItem, e);
        }
    }

    public final String dump(OneLogItem item) {
        return ItemDumper.dump(item);
    }

    public final void flush() {
        cwa cwaVar = cwa.a;
        if (cwa.c == null) {
            synchronized (cwaVar) {
                if (cwa.c == null) {
                    cwa.c = Executors.newSingleThreadExecutor();
                }
            }
        }
        cwa.c.execute(new mc(10));
    }

    public final void send(OneLogItem item) {
        send(item, new cj0(22));
    }

    private final void send(OneLogItem item, sm6 errorCallback) {
        ml apiClient = getApiClient();
        if (apiClient == null) {
            return;
        }
        cwa cwaVar = cwa.a;
        if (cwa.c == null) {
            synchronized (cwaVar) {
                if (cwa.c == null) {
                    cwa.c = Executors.newSingleThreadExecutor();
                }
            }
        }
        cwa.c.execute(new se5(item, apiClient, errorCallback, 26));
    }
}
