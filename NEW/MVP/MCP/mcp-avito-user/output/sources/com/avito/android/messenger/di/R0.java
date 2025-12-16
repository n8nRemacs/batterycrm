package com.avito.android.messenger.di;

import androidx.room.RoomDatabase;
import com.avito.android.C30277e1;
import com.avito.android.messenger.InterfaceC32522f;
import kotlin.Metadata;

/* compiled from: MessengerDatabaseModule.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/di/R0;", "", "<init>", "()V", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes15.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f195700a = 0;

    /* compiled from: MessengerDatabaseModule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/di/R0$a;", "Landroidx/room/RoomDatabase$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RoomDatabase.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f195701a = new a();

        @Override // androidx.room.RoomDatabase.b
        public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
            bVar.P4("DROP TABLE IF EXISTS `channel_user`");
            bVar.P4("DROP TABLE IF EXISTS `messages`");
        }
    }

    /* compiled from: MessengerDatabaseModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/R0$b;", "Landroidx/room/RoomDatabase$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RoomDatabase.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC32522f f195702a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C30277e1 f195703b;

        public b(@Y61.k InterfaceC32522f interfaceC32522f, @Y61.k C30277e1 c30277e1) {
            this.f195702a = interfaceC32522f;
            this.f195703b = c30277e1;
        }

        @Override // androidx.room.RoomDatabase.b
        public final void b(@Y61.k androidx.sqlite.db.framework.b bVar) {
            C30277e1 c30277e1 = this.f195703b;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[34];
            if (((Boolean) c30277e1.f144961H.a().invoke()).booleanValue()) {
                return;
            }
            InterfaceC32522f interfaceC32522f = this.f195702a;
            if (interfaceC32522f.f()) {
                try {
                    bVar.q0();
                    bVar.P4("DELETE FROM `channel`");
                    bVar.P4("DELETE FROM `channel_meta_data`");
                    bVar.P4("DELETE FROM `channel_tag`");
                    bVar.P4("DELETE FROM `draft`");
                    bVar.P4("DELETE FROM `message`");
                    bVar.P4("DELETE FROM `message_meta_info`");
                    bVar.P4("DELETE FROM `message_upload_part`");
                    bVar.P4("DELETE FROM `user`");
                    bVar.P4("DELETE FROM `last_known_user`");
                    bVar.b5();
                    interfaceC32522f.b().i();
                } finally {
                    bVar.g5();
                }
            }
        }
    }

    static {
        new R0();
    }
}
