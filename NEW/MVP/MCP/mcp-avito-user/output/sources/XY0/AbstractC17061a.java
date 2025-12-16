package Xy0;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrInsuranceActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LXy0/a;", "", "a", "b", "c", "d", "LXy0/a$b;", "LXy0/a$c;", "LXy0/a$d;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17061a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C1357a f19170d = new C1357a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f19171a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final RecyclerView.l f19172b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19173c;

    /* compiled from: StrInsuranceActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXy0/a$a;", "", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xy0.a$a, reason: collision with other inner class name */
    public static final class C1357a {
        public /* synthetic */ C1357a(C42822w c42822w) {
            this();
        }

        public C1357a() {
        }
    }

    /* compiled from: StrInsuranceActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXy0/a$b;", "LXy0/a;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xy0.a$b */
    public static final /* data */ class b extends AbstractC17061a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final b f19174e = new b();

        public b() {
            super(-1, null, "key_insurance_confirmation", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 390042926;
        }

        @k
        public final String toString() {
            return "ConfirmationScreen";
        }
    }

    /* compiled from: StrInsuranceActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXy0/a$c;", "LXy0/a;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xy0.a$c */
    public static final /* data */ class c extends AbstractC17061a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final c f19175e = new c();

        public c() {
            super(R.layout.str_insurance_form_footer, null, "key_insurance_flat_form", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1555621206;
        }

        @k
        public final String toString() {
            return "FlatFormScreen";
        }
    }

    /* compiled from: StrInsuranceActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXy0/a$d;", "LXy0/a;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xy0.a$d */
    public static final /* data */ class d extends AbstractC17061a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final d f19176e = new d();

        public d() {
            super(R.layout.str_insurance_offer_footer, new com.avito.android.str_insurance.items.c(), "key_insurance_offer", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 319332955;
        }

        @k
        public final String toString() {
            return "OfferScreen";
        }
    }

    public AbstractC17061a(int i12, RecyclerView.l lVar, String str, C42822w c42822w) {
        this.f19171a = i12;
        this.f19172b = lVar;
        this.f19173c = str;
    }
}
