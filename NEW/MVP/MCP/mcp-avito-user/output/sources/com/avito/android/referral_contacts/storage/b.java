package com.avito.android.referral_contacts.storage;

import AK0.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import com.avito.android.referral_contacts.domain.e;
import com.avito.android.referral_contacts.models.ReferralContactsStorageDto;
import com.avito.android.util.C35836l1;
import com.avito.android.util.R0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReferralContactsStorageImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/storage/b;", "Lcom/avito/android/referral_contacts/storage/a;", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.referral_contacts.storage.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f252561a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f252562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f252563c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f252564d = C42727D.c(new C7585b());

    /* compiled from: ReferralContactsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/referral_contacts/storage/b$a;", "", "<init>", "()V", "", "REFERRAL_CONTACTS_CACHE_PATH", "Ljava/lang/String;", "REFERRAL_CONTACTS_NEXT_CHECK_TIMESTAMP", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralContactsStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.referral_contacts.storage.b$b, reason: collision with other inner class name */
    public static final class C7585b extends N implements Y41.a<File> {
        public C7585b() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File filesDir = b.this.f252562b.getFilesDir();
            C35836l1.a(filesDir);
            return new File(new File(filesDir, "referral_contacts"), "cache.parcel");
        }
    }

    /* compiled from: ReferralContactsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/referral_contacts/models/ReferralContactsStorageDto;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.referral_contacts.storage.ReferralContactsStorageImpl$loadContacts$1", f = "ReferralContactsStorageImpl.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ReferralContactsStorageDto>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252566q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252567r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f252567r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ReferralContactsStorageDto> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Closeable closeable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252566q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f252567r;
                ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream((File) b.this.f252564d.getValue())));
                try {
                    ReferralContactsStorageDto referralContactsStorageDto = (ReferralContactsStorageDto) objectInputStream.readObject();
                    this.f252567r = objectInputStream;
                    this.f252566q = 1;
                    if (interfaceC43172j.emit(referralContactsStorageDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = objectInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = objectInputStream;
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f252567r;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        kotlin.io.c.a(closeable, th);
                        throw th4;
                    }
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(closeable, null);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k l lVar, @k Context context, @k R0 r02) {
        this.f252561a = lVar;
        this.f252562b = context;
        this.f252563c = r02;
    }

    @Override // com.avito.android.referral_contacts.storage.a
    @k
    public final LocalDateTime a() {
        return LocalDateTime.ofEpochSecond(this.f252561a.getLong("REFERRAL_CONTACTS_NEXT_CHECK_TIMESTAMP", -1L), 0, ZoneOffset.UTC);
    }

    @Override // com.avito.android.referral_contacts.storage.a
    public final void b(@k LocalDateTime localDateTime) {
        this.f252561a.putLong("REFERRAL_CONTACTS_NEXT_CHECK_TIMESTAMP", localDateTime.toEpochSecond(ZoneOffset.UTC));
    }

    @Override // com.avito.android.referral_contacts.storage.a
    @Y61.l
    public final Object c(@k ReferralContactsStorageDto referralContactsStorageDto, @k e.a.C7581a c7581a) {
        Object objG = C43259k.g(this.f252563c.a(), new com.avito.android.referral_contacts.storage.c(this, referralContactsStorageDto, null), c7581a);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.referral_contacts.storage.a
    @k
    public final InterfaceC43160i<ReferralContactsStorageDto> d() {
        return C43175k.I(this.f252563c.a(), C43175k.G(new c(null)));
    }
}
