package Hd;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneRequestDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LHd/b;", "", "<init>", "()V", "a", "b", "c", "LHd/b$a;", "LHd/b$b;", "LHd/b$c;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13978b {

    /* compiled from: PhoneRequestDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LHd/b$a;", "LHd/b;", "LJu/c$b;", "<init>", "()V", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hd.b$a */
    public static final class a extends AbstractC13978b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f7560b = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: PhoneRequestDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHd/b$b;", "LHd/b;", "LJu/c$b;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: Hd.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0428b extends AbstractC13978b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f7561b;

        public C0428b(@k DeepLink deepLink) {
            super(null);
            this.f7561b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0428b) && L.f(this.f7561b, ((C0428b) obj).f7561b);
        }

        public final int hashCode() {
            return this.f7561b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ManualMode(nextDeeplink="), this.f7561b, ')');
        }
    }

    /* compiled from: PhoneRequestDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHd/b$c;", "LHd/b;", "LJu/c$a;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hd.b$c */
    public static final /* data */ class c extends AbstractC13978b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f7562b;

        public c(@k DeepLink deepLink) {
            super(null);
            this.f7562b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7562b, ((c) obj).f7562b);
        }

        public final int hashCode() {
            return this.f7562b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PhoneLoaded(nextDeeplink="), this.f7562b, ')');
        }
    }

    public /* synthetic */ AbstractC13978b(C42822w c42822w) {
        this();
    }

    public AbstractC13978b() {
    }
}
