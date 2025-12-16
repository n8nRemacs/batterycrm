package com.avito.android.edit_carousel;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: EditCarouselView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class r extends H implements Y41.l<EditCarouselState, G0> {
    @Override // Y41.l
    public final G0 invoke(EditCarouselState editCarouselState) throws Resources.NotFoundException {
        v vVar = (v) this.receiver;
        EditCarouselState.d dVar = vVar.f146563t;
        EditCarouselState.d dVar2 = editCarouselState.f146486b;
        if (!L.f(dVar, dVar2)) {
            vVar.f146563t = dVar2;
            boolean z12 = dVar2 instanceof EditCarouselState.d.c;
            Button button = vVar.f146559p;
            TextView textView = vVar.f146558o;
            TextView textView2 = vVar.f146557n;
            ImageView imageView = vVar.f146556m;
            com.avito.konveyor.adapter.d dVar3 = vVar.f146546c;
            View view = vVar.f146561r;
            RecyclerView recyclerView = vVar.f146552i;
            if (z12) {
                dVar3.l(C42784z0.f406748b, null);
                D6.w(recyclerView);
                D6.H(view);
                D6.w(imageView);
                D6.w(textView2);
                D6.w(textView);
                D6.w(button);
            } else {
                boolean z13 = dVar2 instanceof EditCarouselState.d.a;
                View view2 = vVar.f146553j;
                Group group = vVar.f146560q;
                if (z13) {
                    EditCarouselState.d.a aVar = (EditCarouselState.d.a) dVar2;
                    I5.a(vVar.f146550g, aVar.f146505a, false);
                    boolean z14 = aVar.f146506b;
                    D6.G(group, z14);
                    if (!z14) {
                        Input.t(vVar.f146551h, "", false, 6);
                    }
                    D6.H(recyclerView);
                    D6.w(view);
                    D6.w(imageView);
                    D6.w(textView2);
                    D6.w(textView);
                    D6.w(button);
                    EditCarouselState.d.a.C4257a c4257a = aVar.f146508d;
                    D6.G(view2, true);
                    I5.a(vVar.f146554k, c4257a.f146509a, false);
                    boolean z15 = c4257a.f146512d;
                    Button button2 = vVar.f146555l;
                    button2.setLoading(z15);
                    boolean z16 = c4257a.f146511c;
                    button2.setEnabled(z16);
                    button2.setClickable(z16);
                    dVar3.l(aVar.f146507c, null);
                } else {
                    boolean z17 = dVar2 instanceof EditCarouselState.d.b;
                    Context context = vVar.f146549f;
                    if (z17) {
                        Resources resources = context.getResources();
                        String string = resources.getString(R.string.extended_profile_carousel_edit_empty_result_title);
                        String string2 = resources.getString(R.string.extended_profile_carousel_edit_empty_result_hint);
                        D6.H(imageView);
                        I5.a(textView2, string, false);
                        I5.a(textView, string2, false);
                        D6.H(group);
                        D6.w(view2);
                        D6.w(recyclerView);
                        D6.w(view);
                        D6.w(button);
                    } else if (dVar2 instanceof EditCarouselState.d.C4258d) {
                        Resources resources2 = context.getResources();
                        String string3 = resources2.getString(R.string.extended_profile_carousel_edit_error_title);
                        String string4 = resources2.getString(R.string.extended_profile_carousel_edit_error_hint);
                        D6.H(imageView);
                        I5.a(textView2, string3, false);
                        I5.a(textView, string4, false);
                        D6.H(button);
                        D6.w(recyclerView);
                        D6.w(view);
                        D6.w(group);
                        D6.w(view2);
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
