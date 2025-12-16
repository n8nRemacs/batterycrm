package com.avito.android.photo_picker.legacy.di;

import android.content.res.Resources;
import com.avito.android.photo_picker.PhotoPickerActivity;
import com.avito.android.photo_picker.legacy.PhotoPickerInteractorState;
import com.avito.android.photo_picker.legacy.PhotoPickerPresenterState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: PhotoPickerModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f;", "", "a", "b", "c", "d", "e", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerActivity f219717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f219718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f219719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PhotoPickerPresenterState f219720d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final PhotoPickerInteractorState f219721e;

    /* renamed from: f, reason: collision with root package name */
    public final int f219722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f219723g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f219724h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Resources f219725i;

    /* compiled from: PhotoPickerModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f$a;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    public @interface a {
    }

    /* compiled from: PhotoPickerModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f$b;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    public @interface b {
    }

    /* compiled from: PhotoPickerModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f$c;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    public @interface c {
    }

    /* compiled from: PhotoPickerModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f$d;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    public @interface d {
    }

    /* compiled from: PhotoPickerModule.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/f$e;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    public @interface e {
    }

    public f(@Y61.k PhotoPickerActivity photoPickerActivity, @Y61.k String str, @Y61.k String str2, @Y61.l PhotoPickerPresenterState photoPickerPresenterState, @Y61.l PhotoPickerInteractorState photoPickerInteractorState, int i12, int i13, boolean z12) {
        this.f219717a = photoPickerActivity;
        this.f219718b = str;
        this.f219719c = str2;
        this.f219720d = photoPickerPresenterState;
        this.f219721e = photoPickerInteractorState;
        this.f219722f = i12;
        this.f219723g = i13;
        this.f219724h = z12;
        this.f219725i = photoPickerActivity.getResources();
    }
}
