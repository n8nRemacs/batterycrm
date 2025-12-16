package com.avito.android.lib.beduin_v2.feature.openlink;

import FV0.c;
import HV0.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import com.avito.beduin.v2.interaction.launch.flow.i;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoOpenWebLinkClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/openlink/a;", "Lcom/avito/beduin/v2/interaction/openlink/flow/a;", "<init>", "()V", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.beduin.v2.interaction.openlink.flow.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public FV0.a f176366b;

    /* compiled from: AvitoOpenWebLinkClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/openlink/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.openlink.a$a, reason: collision with other inner class name */
    public static final class C5227a {
        public /* synthetic */ C5227a(C42822w c42822w) {
            this();
        }

        public C5227a() {
        }
    }

    /* compiled from: AvitoOpenWebLinkClient.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f176367l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Open web link failed";
        }
    }

    static {
        new C5227a(null);
    }

    @Override // FV0.h
    public final void P() {
        this.f176366b = null;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f176366b = aVar;
    }

    public final void b(@k String str, @k i iVar) {
        Context contextRequireContext;
        e eVar = new e(str);
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr = iVar.f337466a;
        int iF2 = P0.f(kVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (com.avito.beduin.v2.interaction.launch.flow.k kVar : kVarArr) {
            linkedHashMap.put(kVar.f337468a, kVar.f337469b);
        }
        eVar.a(linkedHashMap);
        Uri uri = Uri.parse(eVar.b());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        FV0.a aVar = this.f176366b;
        if (aVar == null) {
            V2.f318762a.j("AvitoOpenWebLinkClient", "BeduinHost not attached to client, open web link failed", null);
            return;
        }
        if (aVar instanceof FV0.b) {
            contextRequireContext = ((FV0.b) aVar).N3();
        } else {
            if (!(aVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            contextRequireContext = ((c) aVar).j1().requireContext();
        }
        C35974x2.d(intent);
        try {
            contextRequireContext.startActivity(intent);
        } catch (Exception e12) {
            V2.f318762a.h("AvitoOpenWebLinkClient", e12, b.f176367l);
        }
    }
}
