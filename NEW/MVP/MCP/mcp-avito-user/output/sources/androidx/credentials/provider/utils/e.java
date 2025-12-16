package androidx.credentials.provider.utils;

import Y41.l;
import Y61.k;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CredentialEntry;
import android.service.credentials.RemoteEntry;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.C22864a;
import androidx.credentials.provider.C22865b;
import androidx.credentials.provider.D;
import androidx.credentials.provider.h;
import androidx.credentials.provider.m;
import androidx.credentials.provider.n;
import androidx.credentials.provider.q;
import androidx.credentials.provider.s;
import j.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeginGetCredentialUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/e;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@X
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f45305a = new a(null);

    /* compiled from: BeginGetCredentialUtil.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/e$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/credentials/provider/h;", "kotlin.jvm.PlatformType", "option", "Landroid/service/credentials/BeginGetCredentialOption;", "invoke", "(Landroidx/credentials/provider/h;)Landroid/service/credentials/BeginGetCredentialOption;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.e$a$a, reason: collision with other inner class name */
        public static final class C1768a extends N implements l<androidx.credentials.provider.h, BeginGetCredentialOption> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1768a f45306l = new C1768a();

            public C1768a() {
                super(1);
            }

            @Override // Y41.l
            public final BeginGetCredentialOption invoke(androidx.credentials.provider.h hVar) {
                androidx.credentials.provider.h hVar2 = hVar;
                e.f45305a.getClass();
                androidx.credentials.provider.utils.a.t();
                return androidx.credentials.provider.utils.a.g(hVar2.f45256a, hVar2.f45257b, hVar2.f45258c);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/CredentialEntry;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/q;", "invoke", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b extends N implements l<CredentialEntry, q> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f45307l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final q invoke(CredentialEntry credentialEntry) {
                CredentialEntry credentialEntryQ = androidx.credentials.provider.utils.f.q(credentialEntry);
                q.b bVar = q.f45279f;
                Slice slice = credentialEntryQ.getSlice();
                bVar.getClass();
                return q.b.a(slice);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/q;", "entry", "", "invoke", "(Landroidx/credentials/provider/q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class c extends N implements l<q, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f45308l = new c();

            public c() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(q qVar) {
                return Boolean.valueOf(qVar != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/q;", "entry", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/credentials/provider/q;)Landroidx/credentials/provider/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class d extends N implements l<q, q> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f45309l = new d();

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final q invoke(q qVar) {
                return qVar;
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/Action;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/a;", "invoke", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.e$a$e, reason: collision with other inner class name */
        public static final class C1769e extends N implements l<Action, C22864a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1769e f45310l = new C1769e();

            public C1769e() {
                super(1);
            }

            @Override // Y41.l
            public final C22864a invoke(Action action) {
                Action actionO = androidx.credentials.provider.utils.f.o(action);
                C22864a.c cVar = C22864a.f45241d;
                Slice slice = actionO.getSlice();
                cVar.getClass();
                Iterator it = slice.getItems().iterator();
                CharSequence text = "";
                PendingIntent action2 = null;
                CharSequence text2 = null;
                while (it.hasNext()) {
                    SliceItem sliceItemH = androidx.core.view.accessibility.d.h(it.next());
                    if (sliceItemH.hasHint("androidx.credentials.provider.action.HINT_ACTION_TITLE")) {
                        text = sliceItemH.getText();
                    } else if (sliceItemH.hasHint("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT")) {
                        text2 = sliceItemH.getText();
                    } else if (sliceItemH.hasHint("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")) {
                        action2 = sliceItemH.getAction();
                    }
                }
                try {
                    return new C22864a(text, action2, text2);
                } catch (Exception e12) {
                    e12.getMessage();
                    return null;
                }
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/a;", "entry", "", "invoke", "(Landroidx/credentials/provider/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class f extends N implements l<C22864a, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final f f45311l = new f();

            public f() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(C22864a c22864a) {
                return Boolean.valueOf(c22864a != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/a;", "entry", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/credentials/provider/a;)Landroidx/credentials/provider/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class g extends N implements l<C22864a, C22864a> {

            /* renamed from: l, reason: collision with root package name */
            public static final g f45312l = new g();

            public g() {
                super(1);
            }

            @Override // Y41.l
            public final C22864a invoke(C22864a c22864a) {
                return c22864a;
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/Action;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/b;", "invoke", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class h extends N implements l<Action, C22865b> {

            /* renamed from: l, reason: collision with root package name */
            public static final h f45313l = new h();

            public h() {
                super(1);
            }

            @Override // Y41.l
            public final C22865b invoke(Action action) {
                Action actionO = androidx.credentials.provider.utils.f.o(action);
                C22865b.c cVar = C22865b.f45245c;
                Slice slice = actionO.getSlice();
                cVar.getClass();
                Iterator it = slice.getItems().iterator();
                CharSequence text = null;
                PendingIntent action2 = null;
                while (it.hasNext()) {
                    SliceItem sliceItemH = androidx.core.view.accessibility.d.h(it.next());
                    if (sliceItemH.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")) {
                        action2 = sliceItemH.getAction();
                    } else if (sliceItemH.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE")) {
                        text = sliceItemH.getText();
                    }
                }
                try {
                    return new C22865b(text, action2);
                } catch (Exception e12) {
                    e12.getMessage();
                    return null;
                }
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/b;", "entry", "", "invoke", "(Landroidx/credentials/provider/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class i extends N implements l<C22865b, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final i f45314l = new i();

            public i() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(C22865b c22865b) {
                return Boolean.valueOf(c22865b != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/b;", "entry", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/credentials/provider/b;)Landroidx/credentials/provider/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class j extends N implements l<C22865b, C22865b> {

            /* renamed from: l, reason: collision with root package name */
            public static final j f45315l = new j();

            public j() {
                super(1);
            }

            @Override // Y41.l
            public final C22865b invoke(C22865b c22865b) {
                return c22865b;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static BeginGetCredentialRequest a(@k androidx.credentials.provider.i iVar) {
            BeginGetCredentialRequest.Builder builderH = androidx.credentials.provider.utils.a.h();
            n nVar = iVar.f45260b;
            if (nVar != null) {
                s.B();
                builderH.setCallingAppInfo(s.k(nVar.f45268a, nVar.f45269b, nVar.f45270c));
            }
            return builderH.setBeginGetCredentialOptions((List) iVar.f45259a.stream().map(new androidx.credentials.provider.utils.d(0, C1768a.f45306l)).collect(Collectors.toList())).build();
        }

        @k
        public static BeginGetCredentialResponse b(@k androidx.credentials.provider.j jVar) {
            BeginGetCredentialResponse.Builder builderK = androidx.credentials.provider.utils.a.k();
            for (q qVar : jVar.f45261a) {
                q.f45279f.getClass();
                Slice sliceB = q.b.b(qVar);
                if (sliceB != null) {
                    androidx.credentials.provider.utils.a.D();
                    androidx.credentials.provider.utils.a.t();
                    builderK.addCredentialEntry(androidx.credentials.provider.utils.a.o(androidx.credentials.provider.utils.a.g(qVar.f45281b.f45256a, qVar.getF45280a(), Bundle.EMPTY), sliceB));
                }
            }
            for (C22864a c22864a : jVar.f45262b) {
                androidx.credentials.provider.utils.a.A();
                C22864a.f45241d.getClass();
                androidx.core.view.accessibility.d.q();
                Slice.Builder builderAddText = androidx.core.view.accessibility.d.f(Uri.EMPTY, androidx.core.view.accessibility.d.i()).addText(c22864a.f45242a, null, Collections.singletonList("androidx.credentials.provider.action.HINT_ACTION_TITLE")).addText(c22864a.f45244c, null, Collections.singletonList("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
                builderAddText.addAction(c22864a.f45243b, androidx.core.view.accessibility.d.b(builderAddText).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build(), null);
                builderK.addAction(androidx.credentials.provider.utils.a.d(builderAddText.build()));
            }
            for (C22865b c22865b : jVar.f45263c) {
                androidx.credentials.provider.utils.a.A();
                C22865b.f45245c.getClass();
                androidx.core.view.accessibility.d.q();
                Slice.Builder builderF = androidx.core.view.accessibility.d.f(Uri.EMPTY, androidx.core.view.accessibility.d.w());
                builderF.addAction(c22865b.f45247b, androidx.core.view.accessibility.d.b(builderF).addHints(Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")).build(), null).addText(c22865b.f45246a, null, Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE"));
                builderK.addAuthenticationAction(androidx.credentials.provider.utils.a.d(builderF.build()));
            }
            D d12 = jVar.f45264d;
            if (d12 != null) {
                s.D();
                D.f45239b.getClass();
                builderK.setRemoteCredentialEntry(s.m(D.c.b(d12)));
            }
            return builderK.build();
        }

        @X41.n
        @k
        public static androidx.credentials.provider.i c(@k BeginGetCredentialRequest beginGetCredentialRequest) throws FrameworkClassParsingException {
            androidx.credentials.provider.h kVar;
            Set setP0;
            ArrayList arrayList = new ArrayList();
            Iterator it = beginGetCredentialRequest.getBeginGetCredentialOptions().iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionF = androidx.credentials.provider.utils.a.f(it.next());
                h.a aVar = androidx.credentials.provider.h.f45255d;
                String id2 = beginGetCredentialOptionF.getId();
                String type = beginGetCredentialOptionF.getType();
                Bundle candidateQueryData = beginGetCredentialOptionF.getCandidateQueryData();
                aVar.getClass();
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    androidx.credentials.provider.l.f45265f.getClass();
                    ArrayList<String> stringArrayList = candidateQueryData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                    if (stringArrayList == null || (setP0 = C42745f0.P0(stringArrayList)) == null) {
                        setP0 = B0.f406639b;
                    }
                    kVar = new androidx.credentials.provider.l(setP0, candidateQueryData, id2);
                } else if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    m.f45267e.getClass();
                    try {
                        String string = candidateQueryData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        candidateQueryData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                        kVar = new m(id2, string, candidateQueryData);
                    } catch (Exception unused) {
                        throw new FrameworkClassParsingException();
                    }
                } else {
                    kVar = new androidx.credentials.provider.k(id2, type, candidateQueryData);
                }
                arrayList.add(kVar);
            }
            CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
            return new androidx.credentials.provider.i(arrayList, callingAppInfo != null ? new n(callingAppInfo.getPackageName(), callingAppInfo.getSigningInfo(), callingAppInfo.getOrigin()) : null);
        }

        @k
        public static androidx.credentials.provider.j d(@k BeginGetCredentialResponse beginGetCredentialResponse) {
            D dA2;
            List list = (List) beginGetCredentialResponse.getCredentialEntries().stream().map(new androidx.credentials.provider.utils.d(4, b.f45307l)).filter(new androidx.credentials.provider.utils.b(2, c.f45308l)).map(new androidx.credentials.provider.utils.d(5, d.f45309l)).collect(Collectors.toList());
            List list2 = (List) beginGetCredentialResponse.getActions().stream().map(new androidx.credentials.provider.utils.d(6, C1769e.f45310l)).filter(new androidx.credentials.provider.utils.b(3, f.f45311l)).map(new androidx.credentials.provider.utils.d(7, g.f45312l)).collect(Collectors.toList());
            List list3 = (List) beginGetCredentialResponse.getAuthenticationActions().stream().map(new androidx.credentials.provider.utils.d(8, h.f45313l)).filter(new androidx.credentials.provider.utils.b(1, i.f45314l)).map(new androidx.credentials.provider.utils.d(3, j.f45315l)).collect(Collectors.toList());
            RemoteEntry remoteCredentialEntry = beginGetCredentialResponse.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                D.c cVar = D.f45239b;
                Slice slice = remoteCredentialEntry.getSlice();
                cVar.getClass();
                dA2 = D.c.a(slice);
            } else {
                dA2 = null;
            }
            return new androidx.credentials.provider.j(list, list2, list3, dA2);
        }

        public a() {
        }
    }
}
