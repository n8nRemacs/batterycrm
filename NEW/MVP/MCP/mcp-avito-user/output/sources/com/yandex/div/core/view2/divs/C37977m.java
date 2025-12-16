package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37977m extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<DivAction> f368556l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f368557m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C37955g f368558n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C38029k f368559o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f368560p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37977m(List<? extends DivAction> list, String str, C37955g c37955g, C38029k c38029k, View view) {
        super(0);
        this.f368556l = list;
        this.f368557m = str;
        this.f368558n = c37955g;
        this.f368559o = c38029k;
        this.f368560p = view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        String string = UUID.randomUUID().toString();
        for (DivAction divAction : this.f368556l) {
            String str = this.f368557m;
            int iHashCode = str.hashCode();
            C37955g c37955g = this.f368558n;
            switch (iHashCode) {
                case -338877947:
                    if (str.equals("long_click")) {
                        c37955g.f368382b.getClass();
                        InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                        break;
                    } else {
                        break;
                    }
                case 3027047:
                    if (str.equals("blur")) {
                        c37955g.f368382b.getClass();
                        InterfaceC37915j interfaceC37915j2 = InterfaceC37915j.f367563a;
                        break;
                    } else {
                        break;
                    }
                case 94750088:
                    if (str.equals("click")) {
                        c37955g.f368382b.getClass();
                        InterfaceC37915j interfaceC37915j3 = InterfaceC37915j.f367563a;
                        break;
                    } else {
                        break;
                    }
                case 97604824:
                    if (str.equals("focus")) {
                        c37955g.f368382b.getClass();
                        InterfaceC37915j interfaceC37915j4 = InterfaceC37915j.f367563a;
                        break;
                    } else {
                        break;
                    }
                case 1374143386:
                    if (str.equals("double_click")) {
                        c37955g.f368382b.getClass();
                        InterfaceC37915j interfaceC37915j5 = InterfaceC37915j.f367563a;
                        break;
                    } else {
                        break;
                    }
            }
            C37935b c37935b = c37955g.f368383c;
            C38029k c38029k = this.f368559o;
            c37935b.a(divAction, c38029k.getExpressionResolver());
            c37955g.a(c38029k, divAction, string);
        }
        return kotlin.G0.f406611a;
    }
}
