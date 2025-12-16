package com.avito.android.avl_entry.impl.ui.internal_item.show_all;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ItemPayload.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a;", "", "a", "b", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a$a;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a$b;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: ItemPayload.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a$a;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl_entry.impl.ui.internal_item.show_all.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2957a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f98562a;

        public C2957a(int i12) {
            this.f98562a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2957a) && this.f98562a == ((C2957a) obj).f98562a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f98562a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("DetachVideoPlayer(mediaItemPosition="), this.f98562a, ')');
        }
    }

    /* compiled from: ItemPayload.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a$b;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f98563a;

        public b(int i12) {
            this.f98563a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f98563a == ((b) obj).f98563a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f98563a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("StartVideo(mediaItemPosition="), this.f98563a, ')');
        }
    }
}
