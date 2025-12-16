package com.vk.api.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.vk.api.sdk.m;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VK.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/d;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.vk.api.sdk.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37878d {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static g f366576b;

    /* renamed from: c, reason: collision with root package name */
    public static p f366577c;

    /* renamed from: d, reason: collision with root package name */
    public static G11.c f366578d;

    /* renamed from: f, reason: collision with root package name */
    public static int f366580f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C37878d f366575a = new C37878d();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ArrayList<E> f366579e = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f366581g = C42727D.c(a.f366582l);

    /* compiled from: VK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/utils/m;", "<anonymous>", "()Lcom/vk/api/sdk/utils/m;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.vk.api.sdk.d$a */
    public static final class a extends N implements Y41.a<com.vk.api.sdk.utils.m> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f366582l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.vk.api.sdk.utils.m invoke() {
            return new com.vk.api.sdk.utils.m();
        }
    }

    public static int a(Context context) throws Resources.NotFoundException {
        int integer;
        int i12 = f366580f;
        if (i12 != 0) {
            return i12;
        }
        try {
            integer = context.getResources().getInteger(context.getResources().getIdentifier("com_vk_sdk_AppId", "integer", context.getPackageName()));
        } catch (Exception unused) {
            integer = 0;
        }
        if (integer == 0) {
            throw new RuntimeException("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
        }
        f366580f = integer;
        return integer;
    }

    @X41.n
    public static final void b(@Y61.k Context context) {
        f366575a.getClass();
        g gVar = new g(context, a(context), new v(context), null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, false, null, 8388600, null);
        f366576b = gVar;
        f366577c = new p(gVar);
        f366578d = new G11.c(gVar.f366607q);
        p pVar = f366577c;
        pVar.getClass();
        m.a aVar = m.f366630c;
        C37877c c37877c = C37877c.f366545l;
        aVar.getClass();
        ((com.vk.api.sdk.okhttp.l) pVar.f366679d.getValue()).f366657c = C42727D.c(new n(c37877c));
        G11.c cVar = f366578d;
        cVar.getClass();
        G11.a aVarB = cVar.b();
        if (aVarB == null || !aVarB.a()) {
            return;
        }
        com.vk.api.sdk.requests.a aVar2 = new com.vk.api.sdk.requests.a("stats.trackVisitor", null, 2, null);
        C.f366522a.getClass();
        ((ExecutorService) C.f366525d.getValue()).submit(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(aVar2, 13));
    }
}
