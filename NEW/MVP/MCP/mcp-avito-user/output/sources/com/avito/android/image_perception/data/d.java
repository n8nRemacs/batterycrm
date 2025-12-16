package com.avito.android.image_perception.data;

import AM.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.SharedPreferences;
import com.avito.android.code_confirmation.code_confirmation.h0;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import zM.InterfaceC50484a;

/* compiled from: ImagePerceptionRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_perception/data/d;", "Lcom/avito/android/image_perception/data/a;", "_avito_image-perception_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50484a f169567a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43238h f169568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Map<String, ? extends List<InterfaceC33208b.a>> f169569c = P0.c();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<List<String>, Map<String, List<InterfaceC33208b.a>>> f169570d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f169571e;

    public d(@k Context context, @k InterfaceC50484a interfaceC50484a, @k R0 r02) {
        this.f169567a = interfaceC50484a;
        this.f169568b = U.a(r02.a());
        this.f169571e = context.getSharedPreferences(TooltipAttribute.ATTRIBUTE_TYPE, 0);
    }

    public static final UniversalColor e(d dVar, e eVar) {
        dVar.getClass();
        String valueName = eVar.getColor().getValueName();
        AM.c value = eVar.getColor().getValue();
        Color color = value != null ? new Color((int) value.getValue()) : null;
        AM.c valueDark = eVar.getColor().getValueDark();
        return new UniversalColor(valueName, valueDark != null ? new Color((int) valueDark.getValue()) : null, color);
    }

    @Override // com.avito.android.image_perception.data.a
    public final void a(@k String str) {
        SharedPreferences.Editor editorEdit = this.f169571e.edit();
        editorEdit.putBoolean(str, true);
        editorEdit.apply();
    }

    @Override // com.avito.android.image_perception.data.a
    public final boolean b(@k String str) {
        return this.f169571e.getBoolean(str, false);
    }

    @Override // com.avito.android.image_perception.data.a
    @k
    public final I c(@k final ArrayList arrayList, @l final LinkedHashMap linkedHashMap) {
        Map<String, List<InterfaceC33208b.a>> map = this.f169570d.get(arrayList);
        if (map == null) {
            return new C42006d(new M() { // from class: com.avito.android.image_perception.data.b
                @Override // io.reactivex.rxjava3.core.M
                public final void j(K k12) {
                    d dVar = this.f169559b;
                    k12.f(new h0(C43259k.d(dVar.f169568b, null, null, new c(dVar, arrayList, linkedHashMap, k12, null), 3), 1));
                }
            });
        }
        this.f169569c = map;
        return I.q(map);
    }

    @Override // com.avito.android.image_perception.data.a
    @l
    public final List<InterfaceC33208b.a> d(@k String str) {
        return this.f169569c.get(str);
    }
}
