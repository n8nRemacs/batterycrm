package uo0;

import C11.b;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import cv.d;
import kotlin.Metadata;

/* compiled from: SafetySettingsComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Luo0/a;", "", "a", "b", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49085a {

    /* compiled from: SafetySettingsComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luo0/a$a;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uo0.a$a, reason: collision with other inner class name */
    public interface InterfaceC12730a {
        @k
        InterfaceC49085a a(@h31.b @k C28478k c28478k, @h31.b @k Resources resources, @h31.b @l String str, @k d dVar);
    }

    /* compiled from: SafetySettingsComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luo0/a$b;", "Lcom/avito/android/di/h;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: uo0.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC12730a ll();
    }

    void a(@k SafetySettingsFragment safetySettingsFragment);
}
