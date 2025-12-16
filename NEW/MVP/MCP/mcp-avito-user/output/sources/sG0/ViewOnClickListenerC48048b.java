package sG0;

import A91.r;
import android.view.View;
import com.avito.android.R;
import kotlin.reflect.n;
import rG0.AbstractC47541a;
import ru.mts.biometry.sdk.feature.selfie.ui.intro.e;
import ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g;
import va1.C49291a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: sG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC48048b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f437551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f437552c;

    public /* synthetic */ ViewOnClickListenerC48048b(Object obj, int i12) {
        this.f437551b = i12;
        this.f437552c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f437552c;
        switch (this.f437551b) {
            case 0:
                ((c) obj).f437556e.invoke(AbstractC47541a.b.c.f429678a);
                break;
            case 1:
                n[] nVarArr = e.f436525i0;
                e eVar = (e) obj;
                A91.b.a(r.a(eVar.getResources().getStringArray(R.array.sdk_bio_selfie_intro_list_full)), eVar.getResources().getString(R.string.sdk_bio_selfie_recommendation_dialog_title)).show(eVar.getParentFragmentManager(), "BottomSheetContainer");
                break;
            default:
                C49291a c49291a = g.f436527i0;
                g gVar = (g) obj;
                A91.b.a(r.a(gVar.getResources().getStringArray(R.array.sdk_bio_selfie_intro_list_full)), gVar.getResources().getString(R.string.sdk_bio_selfie_recommendation_dialog_title)).show(gVar.getParentFragmentManager(), "BottomSheetContainer");
                break;
        }
    }
}
