package com.avito.android.profile.pro.impl.converters;

import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProPassportItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/z;", "Lcom/avito/android/profile/pro/impl/converters/y;", "<init>", "()V", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z implements y {

    /* compiled from: ProfileProPassportItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/z$a;", "", "<init>", "()V", "", "VISIBLE_PROFILES_COUNT", "I", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProPassportItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222485a;

        static {
            int[] iArr = new int[ProfileTabWidget.Passport.Status.values().length];
            try {
                ProfileTabWidget.Passport.Status status = ProfileTabWidget.Passport.Status.f222738b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileTabWidget.Passport.Status status2 = ProfileTabWidget.Passport.Status.f222738b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProfileTabWidget.Passport.Status status3 = ProfileTabWidget.Passport.Status.f222738b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f222485a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public z() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.profile.pro.impl.converters.y
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> a(@Y61.k com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget.Passport r21, @Y61.k jz.C42454e r22) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.converters.z.a(com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget$Passport, jz.e):java.util.List");
    }
}
