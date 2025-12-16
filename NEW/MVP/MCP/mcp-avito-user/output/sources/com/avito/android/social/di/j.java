package com.avito.android.social.di;

import android.os.Parcelable;
import com.avito.android.social.SocialType;
import kotlin.Metadata;

/* compiled from: SocialActivityModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/di/j;", "", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f284358a = new j();

    /* compiled from: SocialActivityModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SocialType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<SocialType> creator = SocialType.CREATOR;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<SocialType> creator2 = SocialType.CREATOR;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<SocialType> creator3 = SocialType.CREATOR;
                iArr[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<SocialType> creator4 = SocialType.CREATOR;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Parcelable.Creator<SocialType> creator5 = SocialType.CREATOR;
                iArr[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Parcelable.Creator<SocialType> creator6 = SocialType.CREATOR;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
