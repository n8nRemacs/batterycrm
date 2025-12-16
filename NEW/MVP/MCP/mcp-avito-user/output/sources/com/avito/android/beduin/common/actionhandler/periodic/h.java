package com.avito.android.beduin.common.actionhandler.periodic;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPeriodicActionHandler.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/periodic/h;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100355a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f100356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<io.reactivex.rxjava3.disposables.c> f100357c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f100358d = new LinkedHashMap();

    @Inject
    public h(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar, @k h31.e eVar2) {
        this.f100355a = eVar;
        this.f100356b = interfaceC35745a5;
        this.f100357c = eVar2;
    }
}
