package com.avito.android.confirm_documents_bottom_sheet.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfirmDocumentsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/n;", "", "<init>", "()V", "a", "Lcom/avito/android/confirm_documents_bottom_sheet/mvi/n$a;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class n {

    /* compiled from: ConfirmDocumentsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/n$a;", "Lcom/avito/android/confirm_documents_bottom_sheet/mvi/n;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f125661a;

        public a(boolean z12) {
            super(null);
            this.f125661a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f125661a == ((a) obj).f125661a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f125661a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("Dismiss(withResult="), this.f125661a, ')');
        }
    }

    public /* synthetic */ n(C42822w c42822w) {
        this();
    }

    public n() {
    }
}
