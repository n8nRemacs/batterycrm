package com.avito.android.personal_filters.filters_change_dialog;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersonalFiltersChangeDialogStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/e;", "", "<init>", "()V", "a", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public a f215731a = new a(false, 1, null);

    /* compiled from: PersonalFiltersChangeDialogStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/e$a;", "", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f215732a;

        public a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f215732a == ((a) obj).f215732a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f215732a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("DialogStorageState(dialogShown="), this.f215732a, ')');
        }

        public a(boolean z12) {
            this.f215732a = z12;
        }

        public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    @Inject
    public e() {
    }
}
