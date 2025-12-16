package com.avito.android.profile_settings_extended.adapter.geo;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.q0;
import com.avito.android.R;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile_settings_extended.entity.AddressValue;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: ExtendedSettingsGeoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo/l;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.konveyor.adapter.b implements l, InterfaceC15026b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f229472h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229473b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f229474c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f229475d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f229476e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f229477f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f229478g;

    public m(@Y61.k View view) {
        super(view);
        this.f229473b = new C15027c(view);
        this.f229474c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.extended_profile_geo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229475d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_geo_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229476e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_geo_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f229477f = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_geo_add_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229478g = (Button) viewFindViewById4;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo.l
    public final void MS(@Y61.k ExtendedSettingsGeoItem extendedSettingsGeoItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super ExtendedProfilesSettingsAddress, G0> lVar) {
        String strO;
        I5.a(this.f229475d, extendedSettingsGeoItem.f229451d, false);
        String str = extendedSettingsGeoItem.f229453f;
        Button button = this.f229478g;
        button.setText(str);
        List<AddressValue> list = extendedSettingsGeoItem.f229455h;
        int size = list != null ? list.size() : 0;
        Integer num = extendedSettingsGeoItem.f229454g;
        if (size < (num != null ? num.intValue() : 1)) {
            D6.H(button);
            button.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(11, aVar));
        } else {
            D6.w(button);
            button.setOnClickListener(null);
        }
        LinearLayout linearLayout = this.f229477f;
        linearLayout.removeAllViews();
        List<AddressValue> list2 = list;
        TextView textView = this.f229476e;
        if (list2 == null || list2.isEmpty()) {
            I5.a(textView, extendedSettingsGeoItem.f229452e, false);
            D6.w(linearLayout);
            D6.c(this.f229478g, null, Integer.valueOf(y6.b(16)), null, null, 13);
            return;
        }
        D6.w(textView);
        D6.H(linearLayout);
        D6.c(this.f229478g, null, Integer.valueOf(y6.b(0)), null, null, 13);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = ((AddressValue) it.next()).f230253b;
                View viewInflate = LayoutInflater.from(this.f229474c).inflate(R.layout.ext_profile_settings_geo_schedule_item, (ViewGroup) linearLayout, false);
                View viewFindViewById = viewInflate.findViewById(R.id.extended_profile_geo_address);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                I5.a((TextView) viewFindViewById, extendedProfilesSettingsAddress.f145901c, false);
                List<AddressWorkSchedule> list3 = extendedProfilesSettingsAddress.f145905g;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((AddressWorkSchedule) it2.next()).f145896c;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    strO = C42745f0.O(arrayList, "\n", null, null, null, 62);
                } else {
                    strO = null;
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.extended_profile_geo_schedule);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                I5.a((TextView) viewFindViewById2, strO, false);
                linearLayout.addView(viewInflate);
                View viewFindViewById3 = viewInflate.findViewById(R.id.extended_profile_geo_more_button);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                ((Button) viewFindViewById3).setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(9, lVar, extendedProfilesSettingsAddress));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229478g.setOnClickListener(null);
        Iterator itV = C43033p.v(q0.a(this.f229477f).f410561a);
        while (itV.hasNext()) {
            Button button = (Button) ((View) itV.next()).findViewById(R.id.extended_profile_geo_more_button);
            if (button != null) {
                button.setOnClickListener(null);
            }
        }
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229473b.xT(z12);
    }
}
