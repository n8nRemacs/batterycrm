package K91;

import android.view.View;
import androidx.view.N0;
import kotlinx.coroutines.C43259k;

/* compiled from: R8$$SyntheticClass */
/* renamed from: K91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC14270a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.g f9303c;

    public /* synthetic */ ViewOnClickListenerC14270a(ru.mts.biometry.sdk.feature.address.ui.g gVar, int i12) {
        this.f9302b = i12;
        this.f9303c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9302b) {
            case 0:
                ru.mts.biometry.sdk.feature.address.ui.g gVar = this.f9303c;
                A a12 = (A) gVar.f436420j0.getValue();
                C43259k.d(N0.a(a12), null, null, new z(a12, null), 3);
                ru.mts.biometry.sdk.view.modalcard.b bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar.getParentFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                if (bVar == null) {
                    bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar.getChildFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                }
                if (bVar != null) {
                    bVar.dismissAllowingStateLoss();
                    break;
                }
                break;
            case 1:
                W91.h hVar = this.f9303c.f436418h0;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.d(false);
                break;
            case 2:
                A a13 = (A) this.f9303c.f436420j0.getValue();
                C43259k.d(N0.a(a13), null, null, new z(a13, null), 3);
                break;
            case 3:
                W91.h hVar2 = this.f9303c.f436418h0;
                if (hVar2 == null) {
                    hVar2 = null;
                }
                Aa1.b.a(hVar2, new ru.mts.biometry.sdk.feature.address.ui.o());
                break;
            case 4:
                W91.h hVar3 = this.f9303c.f436418h0;
                if (hVar3 == null) {
                    hVar3 = null;
                }
                Aa1.b.a(hVar3, new ru.mts.biometry.sdk.feature.address.ui.o());
                break;
            default:
                W91.h hVar4 = this.f9303c.f436418h0;
                if (hVar4 == null) {
                    hVar4 = null;
                }
                hVar4.d(true);
                break;
        }
    }
}
