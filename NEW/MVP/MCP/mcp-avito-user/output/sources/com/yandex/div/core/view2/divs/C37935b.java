package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div2.DivAction;
import com.yandex.div2.w8;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivActionBeaconSender.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/b;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37935b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.yandex.android.beacon.d> f368339a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f368340b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f368341c;

    /* compiled from: DivActionBeaconSender.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/divs/b$a;", "", "<init>", "()V", "", "HTTP_HEADER_REFERER", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C37935b(@Y61.k h31.e<com.yandex.android.beacon.d> eVar, @com.yandex.div.core.dagger.B boolean z12, @com.yandex.div.core.dagger.B boolean z13) {
        this.f368339a = eVar;
        this.f368340b = z12;
        this.f368341c = z13;
    }

    public final void a(@Y61.k DivAction divAction, @Y61.k com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.expressions.b<Uri> bVar = divAction.f371216a;
        Uri uriA = bVar == null ? null : bVar.a(eVar);
        if (!this.f368340b || uriA == null) {
            return;
        }
        com.yandex.android.beacon.d dVar = this.f368339a.get();
        if (dVar == null) {
            int i12 = com.yandex.div.internal.n.f370123a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.yandex.div.json.expressions.b<Uri> bVar2 = divAction.f371219d;
        if (bVar2 != null) {
            linkedHashMap.put("Referer", bVar2.a(eVar).toString());
        }
        com.yandex.android.beacon.k kVar = dVar.f367220a;
        kVar.getClass();
        kotlin.jvm.internal.L.j(uriA, "Adding url ");
        kVar.f367229c.a(new com.yandex.android.beacon.j(kVar, uriA, linkedHashMap, divAction.f371218c));
    }

    public final void b(@Y61.k w8 w8Var, @Y61.k com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.expressions.b<Uri> bVar = w8Var.f376955e;
        Uri uriA = bVar == null ? null : bVar.a(eVar);
        if (!this.f368341c || uriA == null) {
            return;
        }
        com.yandex.android.beacon.d dVar = this.f368339a.get();
        if (dVar == null) {
            int i12 = com.yandex.div.internal.n.f370123a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.yandex.div.json.expressions.b<Uri> bVar2 = w8Var.f376954d;
        if (bVar2 != null) {
            linkedHashMap.put("Referer", bVar2.a(eVar).toString());
        }
        com.yandex.android.beacon.k kVar = dVar.f367220a;
        kVar.getClass();
        kotlin.jvm.internal.L.j(uriA, "Adding url ");
        kVar.f367229c.a(new com.yandex.android.beacon.j(kVar, uriA, linkedHashMap, w8Var.f376953c));
    }
}
