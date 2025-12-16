package wr;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmDocumentsDialogFragmentState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lwr/b;", "", "<init>", "()V", "a", "b", "c", "Lwr/b$a;", "Lwr/b$b;", "Lwr/b$c;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC49674b {

    /* compiled from: ConfirmDocumentsDialogFragmentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwr/b$a;", "Lwr/b;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.b$a */
    public static final /* data */ class a extends AbstractC49674b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f441815a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f441816b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f441817c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f441818d;

        public a(@k String str, @k String str2, @k ArrayList arrayList, boolean z12) {
            super(null);
            this.f441815a = str;
            this.f441816b = str2;
            this.f441817c = arrayList;
            this.f441818d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f441815a, aVar.f441815a) && L.f(this.f441816b, aVar.f441816b) && L.f(this.f441817c, aVar.f441817c) && this.f441818d == aVar.f441818d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441818d) + e.g(this.f441817c, H.d(this.f441815a.hashCode() * 31, 31, this.f441816b), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f441815a);
            sb2.append(", description=");
            sb2.append(this.f441816b);
            sb2.append(", buttons=");
            sb2.append(this.f441817c);
            sb2.append(", shouldCallUxFeedback=");
            return r.x(sb2, this.f441818d, ')');
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragmentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/b$b;", "Lwr/b;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12833b extends AbstractC49674b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12833b f441819a = new C12833b();

        public C12833b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12833b);
        }

        public final int hashCode() {
            return -576841335;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragmentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/b$c;", "Lwr/b;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.b$c */
    public static final /* data */ class c extends AbstractC49674b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f441820a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1521896573;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC49674b(C42822w c42822w) {
        this();
    }

    public AbstractC49674b() {
    }
}
