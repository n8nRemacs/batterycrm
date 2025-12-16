package yK;

import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: yK.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50125d<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C50124c f443033b;

    public C50125d(C50124c c50124c) {
        this.f443033b = c50124c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        C50124c c50124c = this.f443033b;
        return kotlin.comparisons.a.b(C50124c.a(c50124c, (AudioDevice) t12), C50124c.a(c50124c, (AudioDevice) t13));
    }
}
