package com.avito.android.beduin.common.component.cart_icon;

import com.avito.android.beduin.common.navigation_bar.cart_native.NavigationBarCartNative;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import kotlin.Metadata;
import mU.C44012a;

/* compiled from: BeduinCartIconViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinCartIconModel f100874c;

    public f(e eVar, BeduinCartIconModel beduinCartIconModel) {
        this.f100873b = eVar;
        this.f100874c = beduinCartIconModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        e eVar = this.f100873b;
        eVar.getClass();
        NavigationBarCartNative.EventData eventData = this.f100874c.f100856e;
        String context = eventData != null ? eventData.getContext() : null;
        String strB = C35800g5.b(new C35792f5(context));
        b.a.a(eVar.f100868a, new CartLink(context, null, 2, null), null, null, 6);
        C44012a.a(eVar.f100869b, null, strB, null, 5);
    }
}
