package com.avito.android.advert_item_actions.actions;

import com.avito.android.beduin.common.component.file_uploader.ApiConfiguration;
import com.avito.android.beduin.common.component.file_uploader.data.b;
import com.avito.android.beduin.common.component.file_uploader.data.o;
import com.avito.android.favorites.C30700w;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import l41.s;
import okhttp3.MultipartBody;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85820b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f85821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f85822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f85823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f85824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f85825g;

    public /* synthetic */ a(c cVar, String str, String str2, String str3, Integer num) {
        this.f85823e = cVar;
        this.f85821c = str;
        this.f85822d = str2;
        this.f85824f = str3;
        this.f85825g = num;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f85820b) {
            case 0:
                return ((c) this.f85823e).f85828a.get().l(this.f85821c, (String) this.f85822d, (String) this.f85824f, (Integer) this.f85825g);
            case 1:
                int i12 = b.a.f101238a[((ApiConfiguration.HttpMethod) this.f85823e).ordinal()];
                h31.e<com.avito.android.beduin.common.component.file_uploader.data.a> eVar = ((com.avito.android.beduin.common.component.file_uploader.data.b) this.f85824f).f101235a;
                Map<String, String> map = (Map) this.f85825g;
                String str = this.f85821c;
                String str2 = (String) this.f85822d;
                return i12 != 1 ? i12 != 3 ? i12 != 4 ? I.l(new o()) : eVar.get().a(str, str2, map) : eVar.get().e(str, str2, map) : eVar.get().c(str, str2, map);
            case 2:
                int i13 = b.a.f101238a[((ApiConfiguration.HttpMethod) this.f85823e).ordinal()];
                h31.e<com.avito.android.beduin.common.component.file_uploader.data.a> eVar2 = ((com.avito.android.beduin.common.component.file_uploader.data.b) this.f85822d).f101235a;
                Map<String, String> map2 = (Map) this.f85825g;
                String str3 = this.f85821c;
                MultipartBody.Part part = (MultipartBody.Part) this.f85824f;
                return i13 != 1 ? i13 != 2 ? I.l(new o()) : eVar2.get().b(str3, part, map2) : eVar2.get().d(str3, part, map2);
            default:
                C30700w c30700w = (C30700w) this.f85823e;
                return c30700w.f157567c.g(c30700w.f157576l.f156271d, (Map) this.f85822d, (Map) this.f85824f, (Boolean) this.f85825g, this.f85821c);
        }
    }

    public /* synthetic */ a(ApiConfiguration.HttpMethod httpMethod, com.avito.android.beduin.common.component.file_uploader.data.b bVar, String str, String str2, Map map) {
        this.f85823e = httpMethod;
        this.f85824f = bVar;
        this.f85821c = str;
        this.f85822d = str2;
        this.f85825g = map;
    }

    public /* synthetic */ a(ApiConfiguration.HttpMethod httpMethod, com.avito.android.beduin.common.component.file_uploader.data.b bVar, String str, MultipartBody.Part part, Map map) {
        this.f85823e = httpMethod;
        this.f85822d = bVar;
        this.f85821c = str;
        this.f85824f = part;
        this.f85825g = map;
    }

    public /* synthetic */ a(C30700w c30700w, Map map, Map map2, Boolean bool, String str) {
        this.f85823e = c30700w;
        this.f85822d = map;
        this.f85824f = map2;
        this.f85825g = bool;
        this.f85821c = str;
    }
}
