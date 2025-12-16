package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneNumbersBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f228237a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f228238b = new C22096n(1794310609, C6939a.f228241l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f228239c = new C22096n(1610119599, b.f228242l, false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C22096n f228240d = new C22096n(-576954604, c.f228243l, false);

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.a$a, reason: collision with other inner class name */
    public static final class C6939a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6939a f228241l = new C6939a();

        public C6939a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.a(com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.f228244a, C20588k2.d(v.f42878y1, 1.0f), null, null, null, null, a13, 54, 60);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f228242l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.a(NumbersListState.EmptyNumbers.f227977b, C20588k2.d(v.f42878y1, 1.0f), null, null, null, null, a13, 54, 60);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f228243l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.a(new NumbersListState.Error(com.avito.android.printable_text.b.f("Какая то ошибка"), false, 2, null), C20588k2.d(v.f42878y1, 1.0f), null, null, null, null, a13, 48, 60);
            }
            return G0.f406611a;
        }
    }
}
