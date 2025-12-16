package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: MergeAccountsExpandItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/v;", "a", "c", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c$a;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c$c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c extends v {

    /* compiled from: MergeAccountsExpandItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c$a;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public final int f213316b;

        public a(int i12) {
            this.f213316b = i12;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF207600b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF213180c() {
            return "MergeAccountsExpandItem.Collapsed";
        }
    }

    /* compiled from: MergeAccountsExpandItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: MergeAccountsExpandItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c$c;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport.profile_add.merge.profiles_list.recycler.c$c, reason: collision with other inner class name */
    public static final class C6394c implements c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C6394c f213317b = new C6394c();

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF207600b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF213180c() {
            return "MergeAccountsExpandItem.Expanded";
        }
    }
}
