package androidx.credentials.provider.utils;

import X41.n;
import Y41.l;
import Y61.k;
import android.app.slice.Slice;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.AbstractC22866c;
import androidx.credentials.provider.C22867d;
import androidx.credentials.provider.D;
import androidx.credentials.provider.f;
import androidx.credentials.provider.g;
import androidx.credentials.provider.p;
import androidx.credentials.provider.s;
import j.X;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeginCreateCredentialUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/c;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f45299a = new a(null);

    /* compiled from: BeginCreateCredentialUtil.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/c$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/CreateEntry;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/p;", "invoke", "(Landroid/service/credentials/CreateEntry;)Landroidx/credentials/provider/p;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.c$a$a, reason: collision with other inner class name */
        public static final class C1766a extends N implements l<CreateEntry, p> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1766a f45300l = new C1766a();

            public C1766a() {
                super(1);
            }

            @Override // Y41.l
            public final p invoke(CreateEntry createEntry) {
                CreateEntry createEntryN = androidx.credentials.provider.utils.a.n(createEntry);
                p.d dVar = p.f45271h;
                Slice slice = createEntryN.getSlice();
                dVar.getClass();
                return p.d.a(slice);
            }
        }

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/p;", "entry", "", "invoke", "(Landroidx/credentials/provider/p;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b extends N implements l<p, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f45301l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(p pVar) {
                return Boolean.valueOf(pVar != null);
            }
        }

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/p;", "entry", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/credentials/provider/p;)Landroidx/credentials/provider/p;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.c$a$c, reason: collision with other inner class name */
        public static final class C1767c extends N implements l<p, p> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1767c f45302l = new C1767c();

            public C1767c() {
                super(1);
            }

            @Override // Y41.l
            public final p invoke(p pVar) {
                return pVar;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static BeginCreateCredentialResponse a(@k C22867d c22867d) {
            BeginCreateCredentialResponse.Builder builderI = s.i();
            for (p pVar : c22867d.f45251a) {
                p.f45271h.getClass();
                Slice sliceB = p.d.b(pVar);
                if (sliceB != null) {
                    builderI.addCreateEntry(s.l(sliceB));
                }
            }
            D d12 = c22867d.f45252b;
            if (d12 != null) {
                s.D();
                D.f45239b.getClass();
                builderI.setRemoteCreateEntry(s.m(D.c.b(d12)));
            }
            return builderI.build();
        }

        @n
        @k
        public static AbstractC22866c b(@k BeginCreateCredentialRequest beginCreateCredentialRequest) throws FrameworkClassParsingException {
            try {
                String type = beginCreateCredentialRequest.getType();
                int iHashCode = type.hashCode();
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        g.a aVar = androidx.credentials.provider.g.f45254d;
                        Bundle data = beginCreateCredentialRequest.getData();
                        CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
                        androidx.credentials.provider.n nVar = callingAppInfo != null ? new androidx.credentials.provider.n(callingAppInfo.getPackageName(), callingAppInfo.getSigningInfo(), callingAppInfo.getOrigin()) : null;
                        aVar.getClass();
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                            return new androidx.credentials.provider.g(data, nVar, string);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    f.a aVar2 = androidx.credentials.provider.f.f45253d;
                    Bundle data2 = beginCreateCredentialRequest.getData();
                    CallingAppInfo callingAppInfo2 = beginCreateCredentialRequest.getCallingAppInfo();
                    androidx.credentials.provider.n nVar2 = callingAppInfo2 != null ? new androidx.credentials.provider.n(callingAppInfo2.getPackageName(), callingAppInfo2.getSigningInfo(), callingAppInfo2.getOrigin()) : null;
                    aVar2.getClass();
                    try {
                        return new androidx.credentials.provider.f(data2, nVar2, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                    } catch (Exception unused2) {
                        throw new FrameworkClassParsingException();
                    }
                }
                String type2 = beginCreateCredentialRequest.getType();
                Bundle data3 = beginCreateCredentialRequest.getData();
                CallingAppInfo callingAppInfo3 = beginCreateCredentialRequest.getCallingAppInfo();
                return new androidx.credentials.provider.e(data3, callingAppInfo3 != null ? new androidx.credentials.provider.n(callingAppInfo3.getPackageName(), callingAppInfo3.getSigningInfo(), callingAppInfo3.getOrigin()) : null, type2);
            } catch (FrameworkClassParsingException unused3) {
                String type3 = beginCreateCredentialRequest.getType();
                Bundle data4 = beginCreateCredentialRequest.getData();
                CallingAppInfo callingAppInfo4 = beginCreateCredentialRequest.getCallingAppInfo();
                return new androidx.credentials.provider.e(data4, callingAppInfo4 != null ? new androidx.credentials.provider.n(callingAppInfo4.getPackageName(), callingAppInfo4.getSigningInfo(), callingAppInfo4.getOrigin()) : null, type3);
            }
        }

        @k
        public static C22867d c(@k BeginCreateCredentialResponse beginCreateCredentialResponse) {
            D dA2;
            List list = (List) beginCreateCredentialResponse.getCreateEntries().stream().map(new d(1, C1766a.f45300l)).filter(new androidx.credentials.provider.utils.b(0, b.f45301l)).map(new d(2, C1767c.f45302l)).collect(Collectors.toList());
            RemoteEntry remoteCreateEntry = beginCreateCredentialResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                D.c cVar = D.f45239b;
                Slice slice = remoteCreateEntry.getSlice();
                cVar.getClass();
                dA2 = D.c.a(slice);
            } else {
                dA2 = null;
            }
            return new C22867d(list, dA2);
        }

        public a() {
        }
    }
}
