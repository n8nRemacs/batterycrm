package ru.ok.android.externcalls.sdk.stat.mldownload;

import defpackage.cm6;
import defpackage.em6;
import defpackage.m81;
import defpackage.n81;
import defpackage.qqg;
import defpackage.u08;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "", "modelId", "", "downloadDurationMs", "Lqqg;", "readyToUse", "(Ljava/lang/String;J)V", NegotiationErrorStat.KEY_ERROR, "(Ljava/lang/String;Ljava/lang/String;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MLDownloadStat extends SingleShotStat {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm81;", "statSender", "Lqqg;", "invoke", "(Lm81;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat$error$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        final /* synthetic */ String $error;
        final /* synthetic */ String $modelId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(1);
            this.$error = str;
            this.$modelId = str2;
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            String str = this.$error;
            EventItemValue eventItemValue = str != null ? EventItemValueKt.toEventItemValue(str) : null;
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("source", this.$modelId);
            ((n81) m81Var).c("ml_error", eventItemValue, eventItemsMap);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm81;", "statSender", "Lqqg;", "invoke", "(Lm81;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat$readyToUse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00581 extends u08 implements em6 {
        final /* synthetic */ long $downloadDurationMs;
        final /* synthetic */ String $modelId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00581(long j, String str) {
            super(1);
            this.$downloadDurationMs = j;
            this.$modelId = str;
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(this.$downloadDurationMs);
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("source", this.$modelId);
            ((n81) m81Var).c("ml_ready_to_use", eventItemValue, eventItemsMap);
        }
    }

    public MLDownloadStat(cm6 cm6Var) {
        super(cm6Var);
    }

    public final void error(String modelId, String error) {
        reportOnce(new AnonymousClass1(error, modelId));
    }

    public final void readyToUse(String modelId, long downloadDurationMs) {
        reportOnce(new C00581(downloadDurationMs, modelId));
    }
}
