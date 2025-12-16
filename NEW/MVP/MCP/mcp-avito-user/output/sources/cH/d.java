package ch;

import Y61.l;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VibrateHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lch/d;", "Lch/c;", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Vibrator f58094a;

    /* compiled from: VibrateHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch/d$a;", "", "<init>", "()V", "", "SHORT_SHOT_LENGTH", "J", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@l Vibrator vibrator) {
        this.f58094a = vibrator;
    }

    @Override // ch.c
    public final void a() {
        Vibrator vibrator = this.f58094a;
        if (vibrator == null || !vibrator.hasVibrator() || vibrator == null) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(150L, -1));
    }
}
