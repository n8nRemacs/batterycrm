package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerSocketTerminationException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "ClosedByUser", "ForbiddenError", "NetworkError", "UnauthorizedError", "Unknown", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$ClosedByUser;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$ForbiddenError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$NetworkError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$UnauthorizedError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$Unknown;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class MessengerSocketTerminationException extends Exception {

    /* compiled from: MessengerSocketTerminationException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$ClosedByUser;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClosedByUser extends MessengerSocketTerminationException {
        public ClosedByUser() {
            super(null);
        }
    }

    /* compiled from: MessengerSocketTerminationException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$ForbiddenError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForbiddenError extends MessengerSocketTerminationException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f431258b;

        /* JADX WARN: Multi-variable type inference failed */
        public ForbiddenError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f431258b;
        }

        public ForbiddenError(@Y61.l Throwable th2) {
            super(null);
            this.f431258b = th2;
        }

        public /* synthetic */ ForbiddenError(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: MessengerSocketTerminationException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$NetworkError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkError extends MessengerSocketTerminationException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f431259b;

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f431259b;
        }

        public NetworkError(@Y61.l Throwable th2) {
            super(null);
            this.f431259b = th2;
        }

        public /* synthetic */ NetworkError(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: MessengerSocketTerminationException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$UnauthorizedError;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnauthorizedError extends MessengerSocketTerminationException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f431260b;

        /* JADX WARN: Multi-variable type inference failed */
        public UnauthorizedError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f431260b;
        }

        public UnauthorizedError(@Y61.l Throwable th2) {
            super(null);
            this.f431260b = th2;
        }

        public /* synthetic */ UnauthorizedError(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: MessengerSocketTerminationException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/connection/MessengerSocketTerminationException$Unknown;", "Lru/avito/messenger/internal/connection/MessengerSocketTerminationException;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unknown extends MessengerSocketTerminationException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f431261b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f431262c;

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f431262c;
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final String getMessage() {
            return this.f431261b;
        }

        public /* synthetic */ Unknown(String str, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2);
        }

        public Unknown(@Y61.l String str, @Y61.l Throwable th2) {
            super(null);
            this.f431261b = str;
            this.f431262c = th2;
        }
    }

    public /* synthetic */ MessengerSocketTerminationException(C42822w c42822w) {
        this();
    }

    private MessengerSocketTerminationException() {
    }
}
