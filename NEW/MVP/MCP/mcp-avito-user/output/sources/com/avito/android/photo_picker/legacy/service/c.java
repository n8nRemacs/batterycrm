package com.avito.android.photo_picker.legacy.service;

import io.reactivex.rxjava3.core.z;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/c;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/c$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/photo_picker/legacy/service/c$a$a;", "Lcom/avito/android/photo_picker/legacy/service/c$a$b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: ImageUploadServiceDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/c$a$a;", "Lcom/avito/android/photo_picker/legacy/service/c$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.legacy.service.c$a$a, reason: collision with other inner class name */
        public static final class C6608a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Collection<Throwable> f219852a;

            /* JADX WARN: Multi-variable type inference failed */
            public C6608a(@Y61.k Collection<? extends Throwable> collection) {
                super(null);
                this.f219852a = collection;
            }
        }

        /* compiled from: ImageUploadServiceDelegate.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/c$a$b;", "Lcom/avito/android/photo_picker/legacy/service/c$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {
            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Y61.k
    z<a> a(@Y61.k String str, @Y61.l String str2, boolean z12);
}
