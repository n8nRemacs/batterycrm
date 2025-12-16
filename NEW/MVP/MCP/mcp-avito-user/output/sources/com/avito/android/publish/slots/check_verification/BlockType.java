package com.avito.android.publish.slots.check_verification;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckVerificationStatusInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/BlockType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BlockType {

    /* renamed from: b, reason: collision with root package name */
    public static final BlockType f243164b;

    /* renamed from: c, reason: collision with root package name */
    public static final BlockType f243165c;

    /* renamed from: d, reason: collision with root package name */
    public static final BlockType f243166d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BlockType[] f243167e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f243168f;

    static {
        BlockType blockType = new BlockType("NONE", 0);
        f243164b = blockType;
        BlockType blockType2 = new BlockType("VERIFICATION_REQ", 1);
        f243165c = blockType2;
        BlockType blockType3 = new BlockType("VERIFICATION_PENDING", 2);
        f243166d = blockType3;
        BlockType[] blockTypeArr = {blockType, blockType2, blockType3};
        f243167e = blockTypeArr;
        f243168f = kotlin.enums.c.a(blockTypeArr);
    }

    public BlockType() {
        throw null;
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) f243167e.clone();
    }
}
