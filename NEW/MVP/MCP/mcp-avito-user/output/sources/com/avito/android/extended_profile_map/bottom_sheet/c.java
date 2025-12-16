package com.avito.android.extended_profile_map.bottom_sheet;

import Y41.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileAddressBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f151185l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar) {
        super(1);
        this.f151185l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        View viewFindViewById = view2.findViewById(R.id.extended_profile_address);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        final f fVar = this.f151185l;
        fVar.f151192e = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.extended_profile_geo_comment);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        fVar.f151193f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.extended_profile_schedule_header);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.extended_profile_map.bottom_sheet.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        f.a(fVar);
                        break;
                    default:
                        f.a(fVar);
                        break;
                }
            }
        });
        fVar.f151194g = textView;
        View viewFindViewById4 = view2.findViewById(R.id.extended_profile_geo_references_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
        fVar.f151199l = new os0.i(linearLayout);
        fVar.f151197j = linearLayout;
        View viewFindViewById5 = view2.findViewById(R.id.extended_profile_schedule_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        fVar.f151198k = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.extended_profile_schedule_expand_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById6;
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.extended_profile_map.bottom_sheet.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        f.a(fVar);
                        break;
                    default:
                        f.a(fVar);
                        break;
                }
            }
        });
        fVar.f151195h = imageView;
        return G0.f406611a;
    }
}
