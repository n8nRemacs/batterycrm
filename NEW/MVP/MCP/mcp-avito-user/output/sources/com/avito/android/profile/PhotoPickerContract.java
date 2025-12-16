package com.avito.android.profile;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import i.AbstractC41201a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l90.c;

/* compiled from: PhotoPickerContract.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/PhotoPickerContract;", "Li/a;", "Lcom/avito/android/profile/PhotoPickerContract$Args;", "Landroid/net/Uri;", "<init>", "()V", "Args", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhotoPickerContract extends AbstractC41201a<Args, Uri> {

    /* compiled from: PhotoPickerContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/PhotoPickerContract$Args;", "", "Type", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Args {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c f221876a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Type f221877b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PhotoPickerContract.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/PhotoPickerContract$Args$Type;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f221878b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f221879c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f221880d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f221881e;

            static {
                Type type = new Type("PROFILE", 0);
                f221878b = type;
                Type type2 = new Type("COMPANY", 1);
                f221879c = type2;
                Type[] typeArr = {type, type2};
                f221880d = typeArr;
                f221881e = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f221880d.clone();
            }
        }

        public Args(@k c cVar, @k Type type) {
            this.f221876a = cVar;
            this.f221877b = type;
        }
    }

    /* compiled from: PhotoPickerContract.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Args.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Args.Type type = Args.Type.f221878b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, Args args) {
        Args args2 = args;
        int iOrdinal = args2.f221877b.ordinal();
        c cVar = args2.f221876a;
        if (iOrdinal == 0) {
            return cVar.a(UUID.randomUUID().toString());
        }
        if (iOrdinal == 1) {
            return cVar.c(UUID.randomUUID().toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // i.AbstractC41201a
    public final Uri parseResult(int i12, Intent intent) {
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
