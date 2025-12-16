package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SharingCommand {

    /* renamed from: b, reason: collision with root package name */
    public static final SharingCommand f411255b;

    /* renamed from: c, reason: collision with root package name */
    public static final SharingCommand f411256c;

    /* renamed from: d, reason: collision with root package name */
    public static final SharingCommand f411257d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SharingCommand[] f411258e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f411259f;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        f411255b = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        f411256c = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        f411257d = sharingCommand3;
        SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        f411258e = sharingCommandArr;
        f411259f = kotlin.enums.c.a(sharingCommandArr);
    }

    public SharingCommand() {
        throw null;
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f411258e.clone();
    }
}
