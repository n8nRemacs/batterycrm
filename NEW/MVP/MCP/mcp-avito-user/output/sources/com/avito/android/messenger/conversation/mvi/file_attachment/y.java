package com.avito.android.messenger.conversation.mvi.file_attachment;

import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: FileStorageHelper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y {

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDeleted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f190757b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f190758c;

        public a(String str, String str2) {
            this.f190757b = str;
            this.f190758c = str2;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zBooleanValue ? "Successfully deleted" : "Failed to delete");
            sb2.append(" file ");
            sb2.append(this.f190758c);
            v22.c(this.f190757b, sb2.toString(), null);
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "t", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f190759b;

        public b(String str) {
            this.f190759b = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.c(this.f190759b, "Failed to delete cached file", (Throwable) obj);
        }
    }

    @Y61.k
    public static final AbstractC41768a a(@Y61.k n nVar, @Y61.l String str, @Y61.k String str2) {
        return str != null ? new io.reactivex.rxjava3.internal.operators.completable.v(nVar.k(str).k(new a(str2, str)).i(new b(str2))).r() : C41823n.f402260b;
    }
}
