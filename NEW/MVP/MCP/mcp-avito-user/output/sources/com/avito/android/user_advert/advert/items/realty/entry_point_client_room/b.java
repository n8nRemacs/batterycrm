package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EntryPointToAccountOwnerBottomSheetDialogFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f309901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f309902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f309903n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f309904o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f309905p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, ArrayList arrayList, Y41.a aVar, com.avito.android.lib.design.bottom_sheet.d dVar, Y41.l lVar) {
        super(1);
        this.f309901l = context;
        this.f309902m = arrayList;
        this.f309903n = aVar;
        this.f309904o = dVar;
        this.f309905p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f309901l);
        for (ExtraAction extraAction : this.f309902m) {
            ViewGroup viewGroup = (ViewGroup) view2;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.user_advert_entry_point_extra_action_item, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text);
            I5.a(textView, extraAction.f309899c, false);
            Integer numM = com.avito.android.lib.util.f.m(extraAction.f309898b);
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar = FV.a.f4720a;
                int iB2 = y6.b(12);
                aVar.getClass();
                FV.a.j(textView, iIntValue, iB2);
            }
            viewInflate.setOnClickListener(new com.avito.android.advert_core.advert.f(extraAction, this.f309903n, this.f309904o, this.f309905p, 11));
            viewGroup.addView(viewInflate);
        }
        return G0.f406611a;
    }
}
