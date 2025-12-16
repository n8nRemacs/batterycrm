package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileSavingResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile/edit/h0;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/profile/edit/h0$a;", "Lcom/avito/android/profile/edit/h0$b;", "Lcom/avito/android/profile/edit/h0$c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class h0 {

    /* compiled from: ProfileSavingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/h0$a;", "Lcom/avito/android/profile/edit/h0;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class a extends h0 {
        public a() {
            super(null);
        }
    }

    /* compiled from: ProfileSavingResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/h0$b;", "Lcom/avito/android/profile/edit/h0;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class b extends h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f222212a;

        public b(@Y61.k Throwable th2) {
            super(null);
            this.f222212a = th2;
        }
    }

    /* compiled from: ProfileSavingResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/h0$c;", "Lcom/avito/android/profile/edit/h0;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends h0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<Long, String> f222213a;

        public c(@Y61.k Map<Long, String> map) {
            super(null);
            this.f222213a = map;
        }
    }

    /* compiled from: ProfileSavingResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/h0$d;", "Lcom/avito/android/profile/edit/h0$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<EditProfileItem> f222214b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k Throwable th2, @Y61.k List<? extends EditProfileItem> list) {
            super(th2);
            this.f222214b = list;
        }
    }

    /* compiled from: ProfileSavingResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/h0$e;", "Lcom/avito/android/profile/edit/h0$a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f222215a;

        public e(@Y61.k String str) {
            this.f222215a = str;
        }
    }

    public /* synthetic */ h0(C42822w c42822w) {
        this();
    }

    public h0() {
    }
}
