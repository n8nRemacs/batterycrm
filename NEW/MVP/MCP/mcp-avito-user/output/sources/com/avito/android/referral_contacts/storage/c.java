package com.avito.android.referral_contacts.storage;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.referral_contacts.models.ReferralContactsStorageDto;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43047d;
import kotlinx.coroutines.T;

/* compiled from: ReferralContactsStorageImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.referral_contacts.storage.ReferralContactsStorageImpl$saveContacts$2", f = "ReferralContactsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f252569q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ReferralContactsStorageDto f252570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ReferralContactsStorageDto referralContactsStorageDto, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f252569q = bVar;
        this.f252570r = referralContactsStorageDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f252569q, this.f252570r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b bVar = this.f252569q;
        File file = (File) bVar.f252564d.getValue();
        if (file.exists()) {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), C43047d.f410589b);
            try {
                outputStreamWriter.write("");
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(outputStreamWriter, null);
            } finally {
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream((File) bVar.f252564d.getValue())));
        try {
            objectOutputStream.writeObject(this.f252570r);
            G0 g03 = G0.f406611a;
            kotlin.io.c.a(objectOutputStream, null);
            return G0.f406611a;
        } finally {
        }
    }
}
