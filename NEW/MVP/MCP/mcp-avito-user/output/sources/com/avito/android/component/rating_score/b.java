package com.avito.android.component.rating_score;

import Y61.k;
import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RatingScoreView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/rating_score/b;", "", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f125228c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f125229d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f125230e;

    /* renamed from: b, reason: collision with root package name */
    public final int f125231b;

    /* compiled from: RatingScoreView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/rating_score/b$a;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        b[] bVarArr = {new b("SMALL", 0, R.drawable.ic_rating_star_small), new b("MEDIUM", 1, R.drawable.ic_rating_star_medium), new b("LARGE", 2, R.drawable.ic_rating_star_large)};
        f125229d = bVarArr;
        f125230e = c.a(bVarArr);
        f125228c = new a(null);
    }

    public b(@InterfaceC42165v String str, int i12, int i13) {
        this.f125231b = i13;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f125229d.clone();
    }
}
