package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.InterfaceC36717n;
import j.N;
import j.P;
import j.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36616a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC10618a f348910a;

    /* renamed from: b, reason: collision with root package name */
    public final g f348911b;

    /* renamed from: c, reason: collision with root package name */
    public final String f348912c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10618a<T extends f, O> extends e<T, O> {
        @N
        @RX0.a
        @Deprecated
        public T buildClient(@N Context context, @N Looper looper, @N C36703g c36703g, @N O o12, @N i.b bVar, @N i.c cVar) {
            return (T) buildClient(context, looper, c36703g, (C36703g) o12, (InterfaceC36637f) bVar, (InterfaceC36664q) cVar);
        }

        @N
        @RX0.a
        public T buildClient(@N Context context, @N Looper looper, @N C36703g c36703g, @N O o12, @N InterfaceC36637f interfaceC36637f, @N InterfaceC36664q interfaceC36664q) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface d {

        /* renamed from: j2, reason: collision with root package name */
        @N
        public static final C10620d f348913j2 = new C10620d(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC10619a extends c, e {
            @N
            Account g();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface b extends c {
            @P
            GoogleSignInAccount d();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface c extends d {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        public static final class C10620d implements e {
            public C10620d() {
            }

            public /* synthetic */ C10620d(w wVar) {
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface e extends d {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$f */
        public interface f extends c, e {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @k0
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class e<T extends b, O> {

        @RX0.a
        public static final int API_PRIORITY_GAMES = 1;

        @RX0.a
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;

        @RX0.a
        public static final int API_PRIORITY_PLUS = 2;

        @N
        @RX0.a
        public List<Scope> getImpliedScopes(@P O o12) {
            return Collections.emptyList();
        }

        @RX0.a
        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface f extends b {
        @RX0.a
        void connect(@N AbstractC36699e.c cVar);

        @RX0.a
        void disconnect();

        @RX0.a
        void disconnect(@N String str);

        @RX0.a
        void dump(@N String str, @P FileDescriptor fileDescriptor, @N PrintWriter printWriter, @P String[] strArr);

        @N
        @RX0.a
        Feature[] getAvailableFeatures();

        @N
        @RX0.a
        String getEndpointPackageName();

        @RX0.a
        @P
        String getLastDisconnectMessage();

        @RX0.a
        int getMinApkVersion();

        @RX0.a
        void getRemoteService(@P InterfaceC36717n interfaceC36717n, @P Set<Scope> set);

        @N
        @RX0.a
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @N
        @RX0.a
        Intent getSignInIntent();

        @RX0.a
        boolean isConnected();

        @RX0.a
        boolean isConnecting();

        @RX0.a
        void onUserSignOut(@N AbstractC36699e.InterfaceC10622e interfaceC10622e);

        @RX0.a
        boolean providesSignIn();

        @RX0.a
        boolean requiresGooglePlayServices();

        @RX0.a
        boolean requiresSignIn();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class g<C extends f> extends c<C> {
    }

    @RX0.a
    public <C extends f> C36616a(@N String str, @N AbstractC10618a<C, O> abstractC10618a, @N g<C> gVar) {
        this.f348912c = str;
        this.f348910a = abstractC10618a;
        this.f348911b = gVar;
    }
}
