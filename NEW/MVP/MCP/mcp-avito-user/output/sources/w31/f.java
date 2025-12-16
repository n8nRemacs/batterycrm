package w31;

import android.util.DisplayMetrics;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f441252l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(0);
        this.f441252l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        DisplayMetrics displayMetrics = this.f441252l.f441254a.getResources().getDisplayMetrics();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(displayMetrics.heightPixels);
        sb2.append('x');
        sb2.append(displayMetrics.widthPixels);
        return sb2.toString();
    }
}
