package com.google.android.gms.internal.mlkit_common;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzhc implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhc f351481a = new zzhc();

    /* renamed from: b, reason: collision with root package name */
    public static final c f351482b = P0.h(1, new c.b("name"));

    /* renamed from: c, reason: collision with root package name */
    public static final c f351483c = P0.h(2, new c.b("version"));

    /* renamed from: d, reason: collision with root package name */
    public static final c f351484d = P0.h(3, new c.b(SearchParamsConverterKt.SOURCE));

    /* renamed from: e, reason: collision with root package name */
    public static final c f351485e = P0.h(4, new c.b(TooltipAttribute.PARAM_DEEP_LINK));

    /* renamed from: f, reason: collision with root package name */
    public static final c f351486f = P0.h(5, new c.b("hash"));

    /* renamed from: g, reason: collision with root package name */
    public static final c f351487g = P0.h(6, new c.b("modelType"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f351488h = P0.h(7, new c.b("size"));

    /* renamed from: i, reason: collision with root package name */
    public static final c f351489i = P0.h(8, new c.b("hasLabelMap"));

    /* renamed from: j, reason: collision with root package name */
    public static final c f351490j = P0.h(9, new c.b("isManifestModel"));

    @Override // com.google.firebase.encoders.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzns zznsVar = (zzns) obj;
        e eVar = (e) obj2;
        eVar.add(f351482b, zznsVar.zzd());
        eVar.add(f351483c, (Object) null);
        eVar.add(f351484d, zznsVar.zzb());
        eVar.add(f351485e, (Object) null);
        eVar.add(f351486f, zznsVar.zzc());
        eVar.add(f351487g, zznsVar.zza());
        eVar.add(f351488h, (Object) null);
        eVar.add(f351489i, (Object) null);
        eVar.add(f351490j, (Object) null);
    }
}
