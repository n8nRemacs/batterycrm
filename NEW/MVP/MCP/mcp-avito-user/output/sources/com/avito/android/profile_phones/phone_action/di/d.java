package com.avito.android.profile_phones.phone_action.di;

import Y61.k;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: PhoneActionModule.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/di/d;", "", "a", "b", "c", "d", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f227282a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhoneActionCode f227283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f227284c;

    /* renamed from: d, reason: collision with root package name */
    public final int f227285d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f227286e;

    /* compiled from: PhoneActionModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/di/d$a;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @h31.h
    public interface a {
    }

    /* compiled from: PhoneActionModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/di/d$b;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface b {
    }

    /* compiled from: PhoneActionModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/di/d$c;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface c {
    }

    /* compiled from: PhoneActionModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/di/d$d;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    /* renamed from: com.avito.android.profile_phones.phone_action.di.d$d, reason: collision with other inner class name */
    public @interface InterfaceC6905d {
    }

    /* compiled from: PhoneActionModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {
        static {
            int[] iArr = new int[PhoneActionCode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<PhoneActionCode> creator = PhoneActionCode.CREATOR;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<PhoneActionCode> creator2 = PhoneActionCode.CREATOR;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(@k Resources resources, @k PhoneActionCode phoneActionCode, @k String str, int i12, @k ArrayList arrayList) {
        this.f227282a = resources;
        this.f227283b = phoneActionCode;
        this.f227284c = str;
        this.f227285d = i12;
        this.f227286e = arrayList;
    }
}
