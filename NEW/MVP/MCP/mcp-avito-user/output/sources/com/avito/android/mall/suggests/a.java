package com.avito.android.mall.suggests;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.search.m;
import com.avito.android.serp.adapter.search_bar.C34823b;
import java.util.Map;
import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f184340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f184341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f184342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f184343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f184344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f184345g;

    public /* synthetic */ a(boolean z12, m mVar, String str, Map map, Map map2, int i12) {
        this.f184340b = i12;
        this.f184341c = z12;
        this.f184345g = mVar;
        this.f184342d = str;
        this.f184343e = map;
        this.f184344f = map2;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f184340b) {
            case 0:
                boolean z12 = this.f184341c;
                Boolean boolValueOf = Boolean.valueOf(z12);
                if (!z12) {
                    boolValueOf = null;
                }
                Boolean bool = boolValueOf;
                return ((b) this.f184345g).f184346a.get().p(this.f184342d, "serp", bool, this.f184343e, this.f184344f);
            default:
                boolean z13 = this.f184341c;
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                if (!z13) {
                    boolValueOf2 = null;
                }
                Boolean bool2 = boolValueOf2;
                C34823b c34823b = (C34823b) this.f184345g;
                V0 v02 = c34823b.f271621a.get();
                String parameterValue = PresentationTypeKt.toParameterValue(c34823b.f271624d);
                if (parameterValue == null) {
                    parameterValue = "";
                }
                Map<String, Boolean> map = this.f184343e;
                Map<String, String> map2 = this.f184344f;
                return v02.p(this.f184342d, parameterValue, bool2, map, map2);
        }
    }
}
