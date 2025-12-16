package com.avito.android.beduin.context.di;

import Gh.C13880a;
import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import cj.InterfaceC27204b;
import cj.InterfaceC27205c;
import cj.InterfaceC27207e;
import com.avito.android.beduin.common.actionhandler.C28743d0;
import com.avito.android.beduin.common.actionhandler.C28784w;
import com.avito.android.beduin.common.actionhandler.Q0;
import com.avito.android.beduin.common.actionhandler.S0;
import com.avito.android.beduin.common.form.j;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.B;
import com.avito.android.remote.model.SearchParams;
import com.google.common.collect.H1;
import di.C39729a;
import dj.InterfaceC39737b;
import fi.C40424a;
import gj.C40692c;
import h31.d;
import java.util.Set;
import kotlin.Metadata;
import li.C43776a;
import mj.InterfaceC44087a;

/* compiled from: BeduinContextComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/context/di/a;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BeduinContextComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/context/di/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d.b
    /* renamed from: com.avito.android.beduin.context.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3106a {

        /* compiled from: BeduinContextComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.context.di.a$a$a, reason: collision with other inner class name */
        public static final class C3107a {
        }

        @k
        a a(@k b bVar, @h31.b @k Set set, @h31.b @k com.avito.android.deeplink_handler.handler.composite.a aVar, @h31.b @k a.b bVar2, @h31.b @k com.avito.android.beduin.context.c cVar, @h31.b @k io.reactivex.rxjava3.disposables.c cVar2, @h31.b @k C40692c c40692c, @h31.b @l SearchParams searchParams, @h31.b @k C13880a c13880a);
    }

    @k
    C43776a a();

    @k
    com.avito.android.beduin.common.form.actionbus.b b();

    @k
    InterfaceC27207e c();

    @k
    InterfaceC27205c d();

    @k
    InterfaceC15522a e();

    @k
    InterfaceC15523b<BeduinAction> f();

    @k
    C39729a h();

    @k
    InterfaceC44087a i();

    @k
    com.avito.android.deeplink_handler.handler.composite.a j();

    @k
    H1 k();

    @k
    com.avito.android.beduin.common.actionhandler.content_placeholder.c l();

    @k
    com.avito.android.beduin.common.a m();

    @k
    j n();

    @k
    C28784w o();

    @k
    com.avito.android.beduin.common.form.store.b p();

    @k
    Q0 q();

    @k
    com.avito.android.beduin.common.actionhandler.content_placeholder.a r();

    @k
    InterfaceC27204b s();

    @k
    a.b t();

    @k
    C28743d0 u();

    @k
    S0 v();

    @k
    InterfaceC39737b w();

    @k
    C40424a x();
}
