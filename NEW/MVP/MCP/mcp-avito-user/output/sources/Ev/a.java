package EV;

import Y41.l;
import android.view.View;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.publish.slots.delivery_summary.item.w;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4028b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f4029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Switcher f4030d;

    public /* synthetic */ a(l lVar, Switcher switcher) {
        this.f4029c = lVar;
        this.f4030d = switcher;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f4029c;
        Switcher switcher = this.f4030d;
        switch (this.f4028b) {
            case 0:
                c cVar = switcher.f180667V;
                Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.f4033c) : null;
                Boolean bool = Boolean.TRUE;
                if (L.f(boolValueOf, bool)) {
                    lVar.invoke(Boolean.FALSE);
                } else if (L.f(boolValueOf, Boolean.FALSE)) {
                    lVar.invoke(bool);
                }
                com.avito.android.lib.design.switcher.a aVar = switcher.f180666U;
                if (aVar != null && aVar.f180678i) {
                    switcher.performHapticFeedback(0);
                    break;
                }
                break;
            default:
                int i12 = w.f243606A;
                lVar.invoke(Boolean.valueOf(switcher.isChecked()));
                break;
        }
    }

    public /* synthetic */ a(Switcher switcher, l lVar) {
        this.f4030d = switcher;
        this.f4029c = lVar;
    }
}
