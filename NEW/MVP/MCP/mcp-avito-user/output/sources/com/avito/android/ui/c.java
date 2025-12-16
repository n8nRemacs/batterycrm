package com.avito.android.ui;

import android.content.Context;
import android.content.Intent;
import com.avito.android.deeplink_handler.view.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IntentModifierActivityNavigator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/c;", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a.InterfaceC4053a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f304581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Y41.l<Intent, Intent>> f304582c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k List<? extends Y41.l<? super Intent, ? extends Intent>> list) {
        this.f304581b = interfaceC4053a;
        this.f304582c = list;
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
        Iterator<T> it = this.f304582c.iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(intent);
        }
        this.f304581b.J(intent, i12, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
        Iterator<T> it = this.f304582c.iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(intent);
        }
        this.f304581b.R(intent, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void X(int i12, @Y61.k Intent intent) {
        this.f304581b.X(i12, intent);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
        this.f304581b.g1(lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void s1() {
        this.f304581b.s1();
    }

    public c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k Y41.l<? super Intent, ? extends Intent> lVar) {
        this(interfaceC4053a, (List<? extends Y41.l<? super Intent, ? extends Intent>>) Collections.singletonList(lVar));
    }
}
