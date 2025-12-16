package com.avito.android.beduin.common.actionhandler.countdown_text;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCountdownTextHandler.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/countdown_text/h;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f100215a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f100217c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<io.reactivex.rxjava3.disposables.c> f100218d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HashMap<String, io.reactivex.rxjava3.disposables.d> f100219e = new HashMap<>();

    @Inject
    public h(@k com.avito.android.beduin.common.form.store.b bVar, @k h31.e<InterfaceC15523b<BeduinAction>> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k h31.e<io.reactivex.rxjava3.disposables.c> eVar2) {
        this.f100215a = bVar;
        this.f100216b = eVar;
        this.f100217c = interfaceC35745a5;
        this.f100218d = eVar2;
    }
}
