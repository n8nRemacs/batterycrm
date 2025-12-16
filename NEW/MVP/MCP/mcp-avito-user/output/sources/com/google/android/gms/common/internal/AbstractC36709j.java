package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36709j<T extends IInterface> extends AbstractC36699e<T> implements C36616a.f, T {

    /* renamed from: F, reason: collision with root package name */
    public final C36703g f349441F;

    /* renamed from: G, reason: collision with root package name */
    public final Set f349442G;

    /* renamed from: H, reason: collision with root package name */
    @j.P
    public final Account f349443H;

    /* JADX WARN: Illegal instructions before constructor call */
    @RX0.a
    public AbstractC36709j(@j.N Context context, @j.N Looper looper, int i12, @j.N C36703g c36703g, @j.N InterfaceC36637f interfaceC36637f, @j.N InterfaceC36664q interfaceC36664q) {
        AbstractC36711k abstractC36711kA = AbstractC36711k.a(context);
        C36687f c36687f = C36687f.f349287e;
        C36729v.j(interfaceC36637f);
        C36729v.j(interfaceC36664q);
        super(context, looper, abstractC36711kA, c36687f, i12, new Q(interfaceC36637f), new S(interfaceC36664q), c36703g.f349429f);
        this.f349441F = c36703g;
        this.f349443H = c36703g.f349424a;
        Set set = c36703g.f349426c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f349442G = set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @j.N
    @RX0.a
    public final Set<Scope> g() {
        return this.f349442G;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    @j.P
    public final Account getAccount() {
        return this.f349443H;
    }

    @j.N
    @RX0.a
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.C36616a.f
    @j.N
    @RX0.a
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.f349442G : Collections.emptySet();
    }
}
