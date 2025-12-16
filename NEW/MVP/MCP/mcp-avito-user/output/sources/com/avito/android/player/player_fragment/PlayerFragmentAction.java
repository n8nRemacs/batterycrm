package com.avito.android.player.player_fragment;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnPlayerFragmentActionListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/player_fragment/PlayerFragmentAction;", "", "_avito_player_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerFragmentAction {

    /* renamed from: b, reason: collision with root package name */
    public static final PlayerFragmentAction f220209b;

    /* renamed from: c, reason: collision with root package name */
    public static final PlayerFragmentAction f220210c;

    /* renamed from: d, reason: collision with root package name */
    public static final PlayerFragmentAction f220211d;

    /* renamed from: e, reason: collision with root package name */
    public static final PlayerFragmentAction f220212e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PlayerFragmentAction[] f220213f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f220214g;

    static {
        PlayerFragmentAction playerFragmentAction = new PlayerFragmentAction("PLAYER_SWIPED", 0);
        f220209b = playerFragmentAction;
        PlayerFragmentAction playerFragmentAction2 = new PlayerFragmentAction("PLAYER_SHOWN", 1);
        f220210c = playerFragmentAction2;
        PlayerFragmentAction playerFragmentAction3 = new PlayerFragmentAction("PLAYER_CLOSED", 2);
        f220211d = playerFragmentAction3;
        PlayerFragmentAction playerFragmentAction4 = new PlayerFragmentAction("PLAYER_RESUMED", 3);
        f220212e = playerFragmentAction4;
        PlayerFragmentAction[] playerFragmentActionArr = {playerFragmentAction, playerFragmentAction2, playerFragmentAction3, playerFragmentAction4};
        f220213f = playerFragmentActionArr;
        f220214g = c.a(playerFragmentActionArr);
    }

    public PlayerFragmentAction() {
        throw null;
    }

    public static PlayerFragmentAction valueOf(String str) {
        return (PlayerFragmentAction) Enum.valueOf(PlayerFragmentAction.class, str);
    }

    public static PlayerFragmentAction[] values() {
        return (PlayerFragmentAction[]) f220213f.clone();
    }
}
