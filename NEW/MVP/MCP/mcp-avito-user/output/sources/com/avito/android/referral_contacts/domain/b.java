package com.avito.android.referral_contacts.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;

/* compiled from: ContactsDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lcom/avito/android/referral_contacts/domain/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.referral_contacts.domain.ContactsDataSource$getAllContacts$1", f = "ContactsDataSource.kt", i = {0, 0, 1, 1}, l = {19, 20, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$channelFlow", "contactNumbersAsync", "$this$channelFlow", "contacts"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<I0<? super List<? extends com.avito.android.referral_contacts.domain.a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f252449q;

    /* renamed from: r, reason: collision with root package name */
    public int f252450r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f252451s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f252452t;

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0005`\u0004*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/HashMap;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.referral_contacts.domain.ContactsDataSource$getAllContacts$1$contactNumbersAsync$1", f = "ContactsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super HashMap<String, ArrayList<String>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ c f252453q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f252453q = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f252453q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super HashMap<String, ArrayList<String>>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c cVar = this.f252453q;
            cVar.getClass();
            HashMap map = new HashMap();
            Cursor cursorQuery = cVar.f252455a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("contact_id");
                int columnIndex2 = cursorQuery.getColumnIndex("data1");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (map.containsKey(string)) {
                        ArrayList arrayList = (ArrayList) map.get(string);
                        if (arrayList != null) {
                            arrayList.add(string2);
                        }
                    } else {
                        map.put(string, C42745f0.j(string2));
                    }
                }
                cursorQuery.close();
            }
            return map;
        }
    }

    /* compiled from: ContactsDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/util/ArrayList;", "Lcom/avito/android/referral_contacts/domain/a;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.referral_contacts.domain.ContactsDataSource$getAllContacts$1$contactsListAsync$1", f = "ContactsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.referral_contacts.domain.b$b, reason: collision with other inner class name */
    public static final class C7580b extends SuspendLambda implements p<T, Continuation<? super ArrayList<com.avito.android.referral_contacts.domain.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ c f252454q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7580b(c cVar, Continuation<? super C7580b> continuation) {
            super(2, continuation);
            this.f252454q = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C7580b(this.f252454q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super ArrayList<com.avito.android.referral_contacts.domain.a>> continuation) {
            return ((C7580b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c cVar = this.f252454q;
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = cVar.f252455a.getContentResolver();
            Cursor cursorQuery = contentResolver != null ? contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, "display_name ASC") : null;
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("_id");
                int columnIndex2 = cursorQuery.getColumnIndex("display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (string2 != null) {
                        arrayList.add(new com.avito.android.referral_contacts.domain.a(string, string2));
                    }
                }
                cursorQuery.close();
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f252452t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f252452t, continuation);
        bVar.f252451s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super List<? extends com.avito.android.referral_contacts.domain.a>> i02, Continuation<? super G0> continuation) {
        return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f252450r
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L37
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r10)
            goto La4
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f252449q
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r4 = r9.f252451s
            kotlinx.coroutines.channels.I0 r4 = (kotlinx.coroutines.channels.I0) r4
            kotlin.C42729a0.b(r10)
            goto L75
        L2b:
            java.lang.Object r1 = r9.f252449q
            kotlinx.coroutines.a0 r1 = (kotlinx.coroutines.InterfaceC43076a0) r1
            java.lang.Object r5 = r9.f252451s
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r10)
            goto L62
        L37:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f252451s
            kotlinx.coroutines.channels.I0 r10 = (kotlinx.coroutines.channels.I0) r10
            com.avito.android.referral_contacts.domain.b$b r1 = new com.avito.android.referral_contacts.domain.b$b
            com.avito.android.referral_contacts.domain.c r6 = r9.f252452t
            r1.<init>(r6, r2)
            kotlinx.coroutines.a0 r1 = kotlinx.coroutines.C43259k.b(r10, r2, r1, r3)
            com.avito.android.referral_contacts.domain.b$a r7 = new com.avito.android.referral_contacts.domain.b$a
            r7.<init>(r6, r2)
            kotlinx.coroutines.a0 r6 = kotlinx.coroutines.C43259k.b(r10, r2, r7, r3)
            r9.f252451s = r10
            r9.f252449q = r6
            r9.f252450r = r5
            java.lang.Object r1 = r1.F(r9)
            if (r1 != r0) goto L5f
            return r0
        L5f:
            r5 = r10
            r10 = r1
            r1 = r6
        L62:
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.f252451s = r5
            r9.f252449q = r10
            r9.f252450r = r4
            java.lang.Object r1 = r1.F(r9)
            if (r1 != r0) goto L71
            return r0
        L71:
            r4 = r5
            r8 = r1
            r1 = r10
            r10 = r8
        L75:
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.util.Iterator r5 = r1.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r5.next()
            com.avito.android.referral_contacts.domain.a r6 = (com.avito.android.referral_contacts.domain.a) r6
            java.lang.String r7 = r6.f252446a
            java.lang.Object r7 = r10.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L7b
            r6.f252448c = r7
            goto L7b
        L94:
            r4.w(r1)
            r9.f252451s = r2
            r9.f252449q = r2
            r9.f252450r = r3
            java.lang.Object r10 = kotlinx.coroutines.channels.F0.b(r4, r9)
            if (r10 != r0) goto La4
            return r0
        La4:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.referral_contacts.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
