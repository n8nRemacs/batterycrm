package com.avito.android.inline_filters;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: InlineFiltersChangesParamsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/h;", "Lcom/avito/android/inline_filters/g;", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31048h implements InterfaceC31047g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43059p f172297a = new C43059p("\\b(params\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43059p f172298b = new C43059p("\\b(price\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43059p f172299c = new C43059p("\\b(metroId\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43059p f172300d = new C43059p("\\b(directionId\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43059p f172301e = new C43059p("\\b(districtId\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43059p f172302f = new C43059p("\\b(owner\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43059p f172303g = new C43059p("\\b(footWalkingMetro\\[[a-zA-Z0-9+-_]+])");

    @Inject
    public C31048h() {
    }

    @Override // com.avito.android.inline_filters.InterfaceC31047g
    @Y61.k
    public final LinkedHashMap a(@Y61.k Map map) {
        String strC;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            if (C43059p.b(this.f172299c, (CharSequence) entry.getKey()) != null) {
                Object key = entry.getKey();
                str = key instanceof String ? (String) key : null;
                strC = str != null ? C43066x.a0(str, SearchParamsConverterKt.METRO_ID, "changes[metroId]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172300d, (CharSequence) entry.getKey()) != null) {
                Object key2 = entry.getKey();
                str = key2 instanceof String ? (String) key2 : null;
                strC = str != null ? C43066x.a0(str, SearchParamsConverterKt.DIRECTION_ID, "changes[directionId]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172301e, (CharSequence) entry.getKey()) != null) {
                Object key3 = entry.getKey();
                str = key3 instanceof String ? (String) key3 : null;
                strC = str != null ? C43066x.a0(str, SearchParamsConverterKt.DISTRICT_ID, "changes[districtId]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172298b, (CharSequence) entry.getKey()) != null) {
                Object key4 = entry.getKey();
                str = key4 instanceof String ? (String) key4 : null;
                strC = str != null ? C43066x.a0(str, "price", "changes[price]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172297a, (CharSequence) entry.getKey()) != null) {
                Object key5 = entry.getKey();
                str = key5 instanceof String ? (String) key5 : null;
                strC = str != null ? C43066x.a0(str, "params", "changes[params]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172302f, (CharSequence) entry.getKey()) != null) {
                Object key6 = entry.getKey();
                str = key6 instanceof String ? (String) key6 : null;
                strC = str != null ? C43066x.a0(str, SearchParamsConverterKt.OWNER, "changes[owner]", false) : (String) entry.getKey();
            } else if (C43059p.b(this.f172303g, (CharSequence) entry.getKey()) != null) {
                Object key7 = entry.getKey();
                str = key7 instanceof String ? (String) key7 : null;
                strC = str != null ? C43066x.a0(str, SearchParamsConverterKt.FOOT_WALKING_METRO, "changes[footWalkingMetro]", false) : (String) entry.getKey();
            } else {
                strC = C22026a.c(new StringBuilder("changes["), (String) entry.getKey(), ']');
            }
            linkedHashMap.put(strC, entry.getValue());
        }
        return linkedHashMap;
    }
}
