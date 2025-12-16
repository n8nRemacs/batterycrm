package wr;

import Y61.k;
import Y61.l;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmDocumentsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lwr/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lwr/a$a;", "Lwr/a$b;", "Lwr/a$c;", "Lwr/a$d;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC49673a {

    /* compiled from: ConfirmDocumentsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/a$a;", "Lwr/a;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12832a extends AbstractC49673a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12832a f441811a = new C12832a();

        public C12832a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12832a);
        }

        public final int hashCode() {
            return -208553880;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: ConfirmDocumentsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/a$b;", "Lwr/a;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.a$b */
    public static final /* data */ class b extends AbstractC49673a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f441812a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1048746404;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: ConfirmDocumentsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/a$c;", "Lwr/a;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.a$c */
    public static final /* data */ class c extends AbstractC49673a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f441813a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 224529287;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: ConfirmDocumentsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwr/a$d;", "Lwr/a;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wr.a$d */
    public static final /* data */ class d extends AbstractC49673a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DocumentButtonItem f441814a;

        public d(@k DocumentButtonItem documentButtonItem) {
            super(null);
            this.f441814a = documentButtonItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f441814a, ((d) obj).f441814a);
        }

        public final int hashCode() {
            return this.f441814a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectDocument(item=" + this.f441814a + ')';
        }
    }

    public /* synthetic */ AbstractC49673a(C42822w c42822w) {
        this();
    }

    public AbstractC49673a() {
    }
}
