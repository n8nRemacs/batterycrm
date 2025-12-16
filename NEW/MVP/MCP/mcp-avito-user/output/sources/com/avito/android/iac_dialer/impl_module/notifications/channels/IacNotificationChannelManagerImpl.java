package com.avito.android.iac_dialer.impl_module.notifications.channels;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.core.app.E;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import com.avito.android.remote.notification.A;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacNotificationChannelManagerImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManagerImpl;", "Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManager;", "ChannelRecreationLimitExceededException", "a", "GetChannelResult", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class IacNotificationChannelManagerImpl implements IacNotificationChannelManager {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f166048j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f166049a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HK.a f166050b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f166051c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A f166052d;

    /* renamed from: f, reason: collision with root package name */
    public int f166054f;

    /* renamed from: g, reason: collision with root package name */
    public int f166055g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f166056h;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f166053e = C42727D.c(new b());

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f166057i = C42727D.c(new e());

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManagerImpl$ChannelRecreationLimitExceededException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
    public static final class ChannelRecreationLimitExceededException extends RuntimeException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManagerImpl$GetChannelResult;", "", "success", "", "(Ljava/lang/String;IZ)V", "getSuccess", "()Z", "ALREADY_ENABLED", "WAS_DISABLED_AND_RECREATED", "WAS_DISABLED_AND_NOT_RECREATED", "WAS_NOT_EXIST_AND_NOT_CREATED", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetChannelResult {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ GetChannelResult[] $VALUES;
        private final boolean success;
        public static final GetChannelResult ALREADY_ENABLED = new GetChannelResult("ALREADY_ENABLED", 0, true);
        public static final GetChannelResult WAS_DISABLED_AND_RECREATED = new GetChannelResult("WAS_DISABLED_AND_RECREATED", 1, true);
        public static final GetChannelResult WAS_DISABLED_AND_NOT_RECREATED = new GetChannelResult("WAS_DISABLED_AND_NOT_RECREATED", 2, false);
        public static final GetChannelResult WAS_NOT_EXIST_AND_NOT_CREATED = new GetChannelResult("WAS_NOT_EXIST_AND_NOT_CREATED", 3, false);

        private static final /* synthetic */ GetChannelResult[] $values() {
            return new GetChannelResult[]{ALREADY_ENABLED, WAS_DISABLED_AND_RECREATED, WAS_DISABLED_AND_NOT_RECREATED, WAS_NOT_EXIST_AND_NOT_CREATED};
        }

        static {
            GetChannelResult[] getChannelResultArr$values = $values();
            $VALUES = getChannelResultArr$values;
            $ENTRIES = kotlin.enums.c.a(getChannelResultArr$values);
        }

        private GetChannelResult(String str, int i12, boolean z12) {
            this.success = z12;
        }

        @Y61.k
        public static kotlin.enums.a<GetChannelResult> getEntries() {
            return $ENTRIES;
        }

        public static GetChannelResult valueOf(String str) {
            return (GetChannelResult) Enum.valueOf(GetChannelResult.class, str);
        }

        public static GetChannelResult[] values() {
            return (GetChannelResult[]) $VALUES.clone();
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManagerImpl$a;", "", "<init>", "()V", "", "MAX_INDEX", "I", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return IacNotificationChannelManagerImpl.this.f166052d.a();
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166060m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f166060m = str;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((E) IacNotificationChannelManagerImpl.this.f166057i.getValue()).f44481b.getNotificationChannel(this.f166060m) != null);
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166062m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f166062m = str;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((E) IacNotificationChannelManagerImpl.this.f166057i.getValue()).f44481b.getNotificationChannel(this.f166062m) != null);
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/core/app/E;", "invoke", "()Landroidx/core/app/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<E> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final E invoke() {
            return IacNotificationChannelManagerImpl.this.f166051c.b();
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Exception, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f166064l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacNotificationChannelManager", "Error on deleting obsolete channel with id '" + exc + '\'', null);
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E f166065l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166066m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(E e12, String str) {
            super(0);
            this.f166065l = e12;
            this.f166066m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f166065l.f44481b.deleteNotificationChannel(this.f166066m);
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E f166067l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacNotificationChannelManagerImpl f166068m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(E e12, IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl) {
            super(0);
            this.f166067l = e12;
            this.f166068m = iacNotificationChannelManagerImpl;
        }

        @Override // Y41.a
        public final List<? extends String> invoke() {
            List<NotificationChannel> notificationChannels = this.f166067l.f44481b.getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : notificationChannels) {
                String id2 = notificationChannel != null ? notificationChannel.getId() : null;
                if (id2 != null) {
                    arrayList.add(id2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                int i12 = IacNotificationChannelManagerImpl.f166048j;
                IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl = this.f166068m;
                iacNotificationChannelManagerImpl.getClass();
                com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166084d.getClass();
                com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar = com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166086f;
                boolean zH02 = C43066x.h0(str, aVar.f166087a, false);
                com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar2 = com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166085e;
                boolean zH03 = C43066x.h0(str, aVar2.f166087a, false);
                boolean zEquals = str.equals(aVar.a(iacNotificationChannelManagerImpl.f166054f));
                boolean zEquals2 = str.equals(aVar2.a(iacNotificationChannelManagerImpl.f166054f));
                if ((zH03 && !zEquals2) || (zH02 && !zEquals)) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<Exception, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.notifications.channels.a f166069l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f166070m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, int i12) {
            super(1);
            this.f166069l = aVar;
            this.f166070m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
            StringBuilder sb2 = new StringBuilder("Error on deleting '");
            sb2.append(this.f166069l);
            sb2.append("' with index '");
            bVar.b("IacNotificationChannelManager", r.t(sb2, this.f166070m, '\''), exc);
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacNotificationChannelManagerImpl f166071l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.notifications.channels.a f166072m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f166073n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i12, com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl) {
            super(0);
            this.f166071l = iacNotificationChannelManagerImpl;
            this.f166072m = aVar;
            this.f166073n = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            E e12 = (E) this.f166071l.f166057i.getValue();
            e12.f44481b.deleteNotificationChannel(this.f166072m.a(this.f166073n));
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationChannel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.a<NotificationChannel> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacNotificationChannelManagerImpl f166074l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.notifications.channels.a f166075m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f166076n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i12, com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl) {
            super(0);
            this.f166074l = iacNotificationChannelManagerImpl;
            this.f166075m = aVar;
            this.f166076n = i12;
        }

        @Override // Y41.a
        public final NotificationChannel invoke() {
            E e12 = (E) this.f166074l.f166057i.getValue();
            return e12.f44481b.getNotificationChannel(this.f166075m.a(this.f166076n));
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<Exception, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.notifications.channels.a f166077l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f166078m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, int i12) {
            super(1);
            this.f166077l = aVar;
            this.f166078m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
            StringBuilder sb2 = new StringBuilder("Error on creating ");
            sb2.append(this.f166077l);
            sb2.append(" with index '");
            bVar.b("IacNotificationChannelManager", r.t(sb2, this.f166078m, '\''), exc);
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationChannel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.a<NotificationChannel> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f166079l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.notifications.channels.a f166080m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ IacNotificationChannelManagerImpl f166081n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i12, com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl) {
            super(0);
            this.f166079l = i12;
            this.f166080m = aVar;
            this.f166081n = iacNotificationChannelManagerImpl;
        }

        @Override // Y41.a
        public final NotificationChannel invoke() {
            com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar = this.f166080m;
            int i12 = this.f166079l;
            if (i12 > 100) {
                throw new ChannelRecreationLimitExceededException(aVar + " breaks channel recreation. It was recreated too much times (100)");
            }
            String strA = aVar.a(i12);
            IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl = this.f166081n;
            NotificationChannel notificationChannel = new NotificationChannel(strA, iacNotificationChannelManagerImpl.f166049a.getString(aVar.f166088b), aVar.f166089c);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationChannel.setBypassDnd(true);
            ((E) iacNotificationChannelManagerImpl.f166057i.getValue()).b(notificationChannel);
            return notificationChannel;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<Integer, G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl = IacNotificationChannelManagerImpl.this;
            iacNotificationChannelManagerImpl.f166050b.k(iIntValue);
            iacNotificationChannelManagerImpl.f166054f = iIntValue;
            return G0.f406611a;
        }
    }

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<Integer, G0> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl = IacNotificationChannelManagerImpl.this;
            iacNotificationChannelManagerImpl.f166050b.m(iIntValue);
            iacNotificationChannelManagerImpl.f166055g = iIntValue;
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public IacNotificationChannelManagerImpl(@Y61.k Application application, @Y61.k HK.a aVar, @Y61.k com.avito.android.notification.m mVar, @Y61.k A a12) {
        this.f166049a = application;
        this.f166050b = aVar;
        this.f166051c = mVar;
        this.f166052d = a12;
        this.f166054f = aVar.f();
        this.f166055g = aVar.h();
        this.f166056h = aVar.n();
    }

    public static Object f(IacNotificationChannelManagerImpl iacNotificationChannelManagerImpl, Y41.a aVar) {
        com.avito.android.iac_dialer.impl_module.notifications.channels.b bVar = com.avito.android.iac_dialer.impl_module.notifications.channels.b.f166090l;
        iacNotificationChannelManagerImpl.getClass();
        try {
            return aVar.invoke();
        } catch (Exception e12) {
            bVar.invoke(e12);
            return null;
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager
    public final void a(@Y61.k E e12) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacNotificationChannelManager", "onNotificationManagerInitialization", null);
        List<String> list = (List) f(this, new h(e12, this));
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        bVar.a("IacNotificationChannelManager", "The following channels will be deleted: " + list, null);
        for (String str : list) {
            f fVar = f.f166064l;
            try {
                new g(e12, str).invoke();
            } catch (Exception e13) {
                fVar.invoke(e13);
            }
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager
    @Y61.k
    public final IacNotificationChannelManager.a b() {
        boolean z12 = this.f166056h;
        InterfaceC42726C interfaceC42726C = this.f166053e;
        if (z12) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationChannelManager", "getActualChannelsIds: Channels recreation is broken - default channel will be used", null);
            return new IacNotificationChannelManager.a((String) interfaceC42726C.getValue(), (String) interfaceC42726C.getValue());
        }
        com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166084d.getClass();
        String strA = com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166085e.a(this.f166054f);
        if (f(this, new c(strA)) == null) {
            strA = null;
        }
        if (strA == null) {
            strA = (String) interfaceC42726C.getValue();
        }
        String strA2 = com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166086f.a(this.f166055g);
        String str = f(this, new d(strA2)) != null ? strA2 : null;
        if (str == null) {
            str = (String) interfaceC42726C.getValue();
        }
        return new IacNotificationChannelManager.a(strA, str);
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager
    @Y61.k
    public final synchronized IacNotificationChannelManager.RecreatingAnalyticsResult c() {
        IacNotificationChannelManager.RecreatingAnalyticsResult recreatingAnalyticsResult;
        GetChannelResult getChannelResult;
        if (this.f166056h) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationChannelManager", "recreateChannelsIfNeeded: Channels recreation is already broken - skip recreation", null);
            return IacNotificationChannelManager.RecreatingAnalyticsResult.ALREADY_BROKEN;
        }
        com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166084d.getClass();
        GetChannelResult getChannelResultE = e(com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166085e, this.f166054f, new n());
        GetChannelResult getChannelResultE2 = e(com.avito.android.iac_dialer.impl_module.notifications.channels.a.f166086f, this.f166055g, new o());
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationChannelManager", "recreateChannelsIfNeeded: Incoming(result=" + getChannelResultE + ", index=" + this.f166054f + "), Ongoing(result=" + getChannelResultE2 + ", index=" + this.f166055g + ')', null);
        if (!getChannelResultE2.getSuccess() || !getChannelResultE.getSuccess()) {
            this.f166050b.a();
            this.f166056h = true;
        }
        int i12 = this.f166054f;
        int i13 = this.f166055g;
        GetChannelResult getChannelResult2 = GetChannelResult.ALREADY_ENABLED;
        if (getChannelResultE == getChannelResult2 && getChannelResultE2 == getChannelResult2) {
            recreatingAnalyticsResult = IacNotificationChannelManager.RecreatingAnalyticsResult.ALREADY_OK;
        } else if (getChannelResultE.getSuccess() && getChannelResultE2.getSuccess()) {
            recreatingAnalyticsResult = (i12 == 1 && i13 == 1) ? IacNotificationChannelManager.RecreatingAnalyticsResult.FIRST_TIME_CREATED : IacNotificationChannelManager.RecreatingAnalyticsResult.RECREATED;
        } else {
            GetChannelResult getChannelResult3 = GetChannelResult.WAS_DISABLED_AND_NOT_RECREATED;
            recreatingAnalyticsResult = (getChannelResultE == getChannelResult3 || getChannelResultE == (getChannelResult = GetChannelResult.WAS_NOT_EXIST_AND_NOT_CREATED) || getChannelResultE2 == getChannelResult3 || getChannelResultE2 == getChannelResult) ? IacNotificationChannelManager.RecreatingAnalyticsResult.BECAME_BROKEN : IacNotificationChannelManager.RecreatingAnalyticsResult.ALREADY_BROKEN;
        }
        return recreatingAnalyticsResult;
    }

    @Override // QK.a
    /* renamed from: d, reason: from getter */
    public final boolean getF166056h() {
        return this.f166056h;
    }

    public final GetChannelResult e(com.avito.android.iac_dialer.impl_module.notifications.channels.a aVar, int i12, Y41.l<? super Integer, G0> lVar) {
        Object objInvoke;
        NotificationChannel notificationChannel = (NotificationChannel) f(this, new k(i12, aVar, this));
        if (notificationChannel != null && (Build.VERSION.SDK_INT < 28 ? notificationChannel.getImportance() != 0 : notificationChannel.getImportance() != 0)) {
            return GetChannelResult.ALREADY_ENABLED;
        }
        int i13 = i12 + 1;
        l lVar2 = new l(aVar, i13);
        try {
            objInvoke = new m(i13, aVar, this).invoke();
        } catch (Exception e12) {
            lVar2.invoke(e12);
            objInvoke = null;
        }
        if (((NotificationChannel) objInvoke) == null) {
            return notificationChannel != null ? GetChannelResult.WAS_DISABLED_AND_NOT_RECREATED : GetChannelResult.WAS_NOT_EXIST_AND_NOT_CREATED;
        }
        lVar.invoke(Integer.valueOf(i13));
        i iVar = new i(aVar, i12);
        try {
            new j(i12, aVar, this).invoke();
        } catch (Exception e13) {
            iVar.invoke(e13);
        }
        return GetChannelResult.WAS_DISABLED_AND_RECREATED;
    }
}
