package com.avito.android.photo_list_view_groups;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScoringResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view_groups/q;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_list_view_groups/q$a;", "Lcom/avito/android/photo_list_view_groups/q$b;", "Lcom/avito/android/photo_list_view_groups/q$c;", "_avito_photo-list-view-groups_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class q {

    /* compiled from: ScoringResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/q$a;", "Lcom/avito/android/photo_list_view_groups/q;", "_avito_photo-list-view-groups_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f218639a;

        public a(@Y61.k String str) {
            super(null);
            this.f218639a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f218639a, ((a) obj).f218639a);
        }

        public final int hashCode() {
            return this.f218639a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failed(imageUploadId="), this.f218639a, ')');
        }
    }

    /* compiled from: ScoringResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/q$b;", "Lcom/avito/android/photo_list_view_groups/q;", "_avito_photo-list-view-groups_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f218640a;

        public b(@Y61.k String str) {
            super(null);
            this.f218640a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218640a, ((b) obj).f218640a);
        }

        public final int hashCode() {
            return this.f218640a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(imageUploadId="), this.f218640a, ')');
        }
    }

    /* compiled from: ScoringResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/q$c;", "Lcom/avito/android/photo_list_view_groups/q;", "_avito_photo-list-view-groups_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f218641a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f218642b;

        public c(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f218641a = str;
            this.f218642b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f218641a, cVar.f218641a) && L.f(this.f218642b, cVar.f218642b);
        }

        public final int hashCode() {
            return this.f218642b.hashCode() + (this.f218641a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(imageUploadId=");
            sb2.append(this.f218641a);
            sb2.append(", imageGroup=");
            return C22026a.c(sb2, this.f218642b, ')');
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}
